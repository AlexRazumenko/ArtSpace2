package org.alex.artspace.service;

import org.alex.artspace.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    User updateUser (User user);
    void deleteUser (Long id);
    User getUserById (Long id);
    Optional<User> findUserById (Long id);
    User findUserByEmail (String email);
    //    Optional<User> findUserByEmail (String email);
    User findUserByName (String name);
    List<User> findAllUsers();


}
