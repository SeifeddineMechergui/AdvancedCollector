package com.seifeddine.AdvancedCollector.repository.implementations;
import  com.seifeddine.AdvancedCollector.domain.User;
import  com.seifeddine.AdvancedCollector.exeptions.ApiExeption;
import  com.seifeddine.AdvancedCollector.repository.UserRepository;
import com.seifeddine.AdvancedCollector.repository.RoleRepository;
import  lombok.RequiredArgsConstructor;
import  lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import  org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import  org.springframework.stereotype.Repository;
import  java.util.Collection;
import  java.util.Map;

import static com.seifeddine.AdvancedCollector.query.UserQuery.INSERT_USER_QUERY;
import static com.seifeddine.AdvancedCollector.query.UserQuery.USER_COUNT_EMAIL_QUERY;
import static java.util.Objects.requireNonNull;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryIml implements UserRepository {

    private final NamedParameterJdbcTemplate jdbc;
    private final RoleRepository roleRepository;
    @Override
    public User create(User user) {
        if(getEmailCount(user.getEmail().trim().toLowerCase())>0) throw new ApiExeption("Email already in use , please to use different email and try again");


        try {
            KeyHolder holder = new GeneratedKeyHolder();
            SqlParameterSource parameters=getSqlParameterSource(user);
            jdbc.update(INSERT_USER_QUERY,parameters,holder);
            user.setId(requireNonNull(holder.getKey()).longValue());
            roleRepository.addRoleToUser(user.getId(),ROLE_USER.name());
        }catch (EmptyResultDataAccessException exception){

        }
        return null;
    }



    @Override
    public Collection list(int page, int pagesize) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User update(User data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
    private Integer getEmailCount(String email) {
        return jdbc.queryForObject(USER_COUNT_EMAIL_QUERY, Map.of("email",email),Integer.class);
    }
    private SqlParameterSource getSqlParameterSource(User user) {
    }


}


