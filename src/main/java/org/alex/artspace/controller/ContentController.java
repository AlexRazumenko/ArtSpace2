package org.alex.artspace.controller;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.ContentType;
import org.alex.artspace.entity.User;
import org.alex.artspace.service.impl.ContentServiceImpl;
import org.alex.artspace.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

//import org.alex.artspace.service.impl.TextContentServiceImpl;

@Controller
@SessionAttributes(value = "currentUser")
public class ContentController {

    private UserServiceImpl userService;
    private ContentServiceImpl contentService;
    private String message = "Welcome!";

    @Autowired
    public ContentController(ContentServiceImpl contentService, UserServiceImpl userService) {
        this.contentService = contentService;
        this.userService = userService;
    }

    @ModelAttribute("currentUser")
    public User createUser() {
        return new User();
    }

    @GetMapping("/allContents")
    public ModelAndView getAllContent() {
        List<Content> allContentList = contentService.getAllContents();
        ModelAndView modelAndView = new ModelAndView("allContents");
        modelAndView.addObject("allContentList", allContentList);
        modelAndView.addObject("message", "All contents:");
        return modelAndView;
    }

    @GetMapping("/addContent")
    public ModelAndView addContent(@ModelAttribute User currentUser) {
        ModelAndView modelAndView = new ModelAndView("contentsPage");
        modelAndView.addObject("newContent", new Content());
        modelAndView.addObject("message", "Enter data to upload:");
        modelAndView.addObject("typeEnumValues", ContentType.values());
        return modelAndView;
    }

    @PostMapping("/addContent")
    public ModelAndView addContent(@ModelAttribute("newContent") Content content, @ModelAttribute("currentUser") User currentUser) {
        contentService.createContent(content, currentUser);
        message = "Content successfully created!";
        ModelAndView modelAndView = new ModelAndView("contentsPage");
        modelAndView.addObject("message","Content successfully created!");
        return modelAndView; //"redirect:/user/" + content.getAuthor().getId();
    }

    @DeleteMapping("/deleteContent/{id}")
    public String deleteContent(@PathVariable("id") Long id, @SessionAttribute("currentUser") User currentUser) {
        contentService.deleteContent(id);
        return "redirect:/user/" + currentUser.getId();
    }

    @GetMapping ("/content/{id}")
    public ModelAndView getContentById (@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("contentPage");
        modelAndView.addObject("currentContent", contentService.getContentById(id));
        return modelAndView;
    }


    @PutMapping("/updateContent/{id}")
    public String updateContent(@PathVariable("id") Long id, @SessionAttribute("currentUser") User currentUser) {

        Optional<Content> contentOptional = contentService.findContentById(id);
        message = "Error occured!";
        contentOptional.ifPresent(content -> {
            content = contentService.updateContent(content);
            message = "Content updated";
        });
//        if (contentOptional.isPresent()) {
//            Content content = contentService.updateContent(contentOptional.);

//        }
        return "redirect/user/" + currentUser.getId();
    }

}
