package org.alex.artspace.repository;

<<<<<<< HEAD
import org.alex.artspace.entity.Content;
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
=======

>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
public interface UserRepository extends JpaRepository <User, Long> {

    @Query("select u from User u where u.id = :id")
    User findUserById(@Param("id") Long id);

    @Query ("select u from User u where u.email = :email")
    User findUserByEmail(@Param("email") String email);

    @Query ("select u from User u where u.name = :name")
    User findUserByName(@Param("name") String name);

<<<<<<< HEAD
//    @Query ("select c from Content c where c.author.id = :id")
//    List<Content> findContentByUser (Long id);



=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

}
