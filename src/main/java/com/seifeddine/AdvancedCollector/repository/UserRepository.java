package com.seifeddine.AdvancedCollector.repository;

import com.seifeddine.AdvancedCollector.domain.User;
import java.util.Collection;


public interface UserRepository < T extends User>{
    /* CRUD */

    /* create */
    T create(T data);
    Collection<T> list(int page,int pagesize);
    T get(Long id);
    T update(T data);
    Boolean  delete(Long id);

    /* more complexe crud */
}
