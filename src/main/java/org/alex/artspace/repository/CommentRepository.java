package org.alex.artspace.repository;

import org.alex.artspace.entity.Comment;
import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Long> {


    Comment findCommentById(Long id);

    List<Comment> findCommentsByAuthor (User user);

    List<Comment> findCommentsByContentOrderByDateDesc (Content content);

void deleteById(Long id);


}
