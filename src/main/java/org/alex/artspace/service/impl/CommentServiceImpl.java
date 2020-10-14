package org.alex.artspace.service.impl;

import org.alex.artspace.entity.Comment;
import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;
import org.alex.artspace.repository.CommentRepository;
import org.alex.artspace.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
<<<<<<< HEAD
        commentRepository.deleteById(id);
=======
commentRepository.deleteById(id);
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
    }

    @Override
    public Optional<Comment> findCommentById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public List<Comment> findCommentsByAuthor(User author) {
        return commentRepository.findCommentsByAuthor(author);
    }

    @Override
    public List<Comment> findCommentsByContent(Content content) {
        return commentRepository.findCommentsByContentOrderByDateDesc(content);
    }
}
