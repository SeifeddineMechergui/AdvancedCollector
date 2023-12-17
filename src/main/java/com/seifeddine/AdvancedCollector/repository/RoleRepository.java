package com.seifeddine.AdvancedCollector.repository;


import com.seifeddine.AdvancedCollector.domain.Role;

import java.util.Collection;

public interface RoleRepository< T extends Role>{
    /* CRUD */

    /* create */
    T create(T data);
    Collection<T> list(int page, int pagesize);
    T get(Long id);
    T update(T data);
    Boolean  delete(Long id);

    /* more complexe crud */
    void addRoleToUser(Long Userid,String roleName);
}
