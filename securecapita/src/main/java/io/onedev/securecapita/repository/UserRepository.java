package io.onedev.securecapita.repository;

import io.onedev.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository <T extends User>{
    /*Basic crud operations */

    T create(T user);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
}
