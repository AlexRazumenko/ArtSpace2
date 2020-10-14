package org.alex.artspace.service;

import org.alex.artspace.entity.Comment;
import org.alex.artspace.entity.Content;
<<<<<<< HEAD
=======
import org.alex.artspace.entity.TextContent;
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
import org.alex.artspace.entity.User;

import java.util.List;
import java.util.Optional;

public interface CommentService {


<<<<<<< HEAD


    Comment createComment (Comment comment);
    Comment updateComment (Comment comment);
    void deleteComment(Long id);
    Optional<Comment> findCommentById(Long id);
    List<Comment> findCommentsByAuthor (User author);
    List<Comment> findCommentsByContent (Content content);



}

=======
    Comment createComment (Comment comment);
    Comment updateComment (Comment comment);
    void deleteComment (Long id);
    Optional<Comment> findCommentById (Long id);
    List<Comment> findCommentsByAuthor (User author);
    List<Comment> findCommentsByContent (Content content);

//    TextContent createTextContent (TextContent content);
//    User updateTextContent (TextContent content);
//    void deleteTextContent (Long id);
//    TextContent getTextContentById (Long id);
//    Optional<TextContent> findTextContentById (Long id);
//    TextContent findTextContentByAuthor (User author);
//    //    Optional<User> findUserByEmail (String email);
//    User findUserByName (String name);
//    List<User> findAllUsers();

}
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
