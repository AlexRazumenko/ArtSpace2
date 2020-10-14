package org.alex.artspace.controller;


import org.alex.artspace.entity.User;
import org.alex.artspace.service.impl.ContentServiceImpl;
import org.alex.artspace.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value = "currentUser")
public class UserController {


    private UserServiceImpl userService;
    private ContentServiceImpl contentService;
    private String message = "Welcome!";

    @Autowired
    public UserController(UserServiceImpl userService, ContentServiceImpl contentService) {
        this.contentService = contentService;
        this.userService = userService;
    }

    @ModelAttribute("currentUser")
    public User createUser() {
        return new User();
    }

    @GetMapping("/")
    public ModelAndView index(@ModelAttribute("currentUser") User user) {
        if (user == null) return new ModelAndView("login");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("currentUser", user);
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView redirectToLoginPage(@ModelAttribute("currentUser") User user) {
        return new ModelAndView("loginPage");
    }

    @PostMapping("/login")
    public synchronized ModelAndView login(@ModelAttribute("currentUser") User loggedUser) {
        User user = userService.findUserByEmail(loggedUser.getEmail());
        ModelAndView modelAndView = new ModelAndView("loginPage");
        if ((user == null) || (!user.getPassword().equals(loggedUser.getPassword()))) {
            modelAndView.addObject("message", "E-mail or password is incorrect!");
            return modelAndView;
        } else {
            modelAndView.setViewName("index");
            modelAndView.addObject("currentUser", user);
            modelAndView.addObject("message", "Welcome, " + user.getName() + "!");
            return modelAndView;
        }
    }

    @GetMapping("/users")
    public ModelAndView getUsersPage(@ModelAttribute("currentUser") User currentUser) {
        ModelAndView modelAndView = new ModelAndView("usersPage");
        modelAndView.addObject("message", message);
        modelAndView.addObject("currentUser", currentUser);
        modelAndView.addObject("allUsersList", userService.findAllUsers());
        return modelAndView;
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute("newUser") User newUser) {
        userService.createUser(newUser);
        message = "User " + newUser.getName() + " created";
        return "redirect:/users";
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        message = "User successfully deleted";
        return "redirect:/users";
    }


    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);

        ModelAndView modelAndView = new ModelAndView("userPage");
        modelAndView.addObject("user", user);
        modelAndView.addObject("userContent", contentService.findContentByAuthor(user));
        return modelAndView;
    }


    @PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
        message = "User " + user.getName() + " updated";
        return "redirect/user/" + id;
    }


}
