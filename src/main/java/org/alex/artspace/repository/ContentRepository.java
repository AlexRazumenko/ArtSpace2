package org.alex.artspace.repository;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.ContentType;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

@Repository
public interface ContentRepository extends JpaRepository <Content, Long> {

<<<<<<< HEAD
    Content findContentById(Long id);
=======
    Content findContentById (Long id);
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

    List<Content> findContentsByAuthor (User author);

    List <Content> findContentsByType (ContentType type);

<<<<<<< HEAD
    @Override
    Optional<Content> findById(Long aLong);

//    Optional<Content>

=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
    List <Content> findAll();


}
