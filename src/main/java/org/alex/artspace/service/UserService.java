package org.alex.artspace.service;

<<<<<<< HEAD
import org.alex.artspace.entity.Content;
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
import org.alex.artspace.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    User updateUser (User user);
<<<<<<< HEAD
    void deleteUser(Long id);
    User getUserById(Long id);
    //    Optional<User> findUserById(Long id);
    User findUserByEmail(String email);
    //    Optional<User> findUserByEmail (String email);
    User findUserByName(String name);
    List<User> findAllUsers();

    List<Content> getContentByUser(Long id);


=======
    void deleteUser (Long id);
    User getUserById (Long id);
    Optional<User> findUserById (Long id);
    User findUserByEmail (String email);
    //    Optional<User> findUserByEmail (String email);
    User findUserByName (String name);
    List<User> findAllUsers();

>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

}
