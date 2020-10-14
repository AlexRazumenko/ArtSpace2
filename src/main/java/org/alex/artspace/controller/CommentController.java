package org.alex.artspace.controller;

import org.alex.artspace.entity.Comment;
import org.alex.artspace.entity.User;
import org.alex.artspace.service.impl.CommentServiceImpl;
import org.alex.artspace.service.impl.ContentServiceImpl;
import org.alex.artspace.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = "currentUser")
public class CommentController {

    private UserServiceImpl userService;
    private CommentServiceImpl contentService;
    private String message = "Welcome!";

    @Autowired
    public CommentController(UserServiceImpl userService, CommentServiceImpl contentService) {
        this.userService = userService;
        this.contentService = contentService;
    }

    @ModelAttribute("currentUser")
    public User createUser() {
        return new User();
    }

    @PostMapping("/addComment")
    public String addComment (@ModelAttribute("newComment")Comment comment) {
        contentService.createComment(comment);
        message = "Comment successfully created!";
        return "redirect:/user/" + comment.getAuthor().getId();
    }
}
