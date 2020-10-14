package org.alex.artspace.repository;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    @Query("select u from User u where u.id = :id")
    User findUserById(@Param("id") Long id);

    @Query ("select u from User u where u.email = :email")
    User findUserByEmail(@Param("email") String email);

    @Query ("select u from User u where u.name = :name")
    User findUserByName(@Param("name") String name);

//    @Query ("select c from Content c where c.author.id = :id")
//    List<Content> findContentByUser (Long id);




}
