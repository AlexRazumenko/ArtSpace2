package org.alex.artspace.repository;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.ContentType;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository <Content, Long> {

    Content findContentById (Long id);

    List<Content> findContentsByAuthor (User author);

    List <Content> findContentsByType (ContentType type);

    List <Content> findAll();


}
