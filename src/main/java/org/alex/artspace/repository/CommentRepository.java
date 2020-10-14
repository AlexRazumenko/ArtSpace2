package org.alex.artspace.repository;

import org.alex.artspace.entity.Comment;
import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Long> {


<<<<<<< HEAD
    Comment findCommentById(Long id);
=======
    Comment findCommentById (Long id);
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

    List<Comment> findCommentsByAuthor (User user);

    List<Comment> findCommentsByContentOrderByDateDesc (Content content);

void deleteById(Long id);


}
