package com.seifeddine.AdvancedCollector.implementations;

import com.seifeddine.AdvancedCollector.domain.User;
import com.seifeddine.AdvancedCollector.repository.UserRepository;

import java.util.Collection;

public class UserRepositoryIml implements UserRepository {
    @Override
    public User create(User data) {
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
}
