package io.onedev.securecapita.repository;

import io.onedev.securecapita.domain.Role;
import io.onedev.securecapita.domain.User;

import java.util.Collection;

public interface RoleRepository <T extends Role>{
    /*Basic crud operations */

    T create(T user);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
    void addRoleToUser(Long userId, String roleName);
}
