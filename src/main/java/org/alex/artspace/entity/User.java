package org.alex.artspace.entity;

import org.alex.artspace.Role;
import org.springframework.stereotype.Component;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
import java.util.Date;
import java.util.List;

@Entity
<<<<<<< HEAD
//@Component
@Table(name = "users")
=======
@Component
@Table (name = "users")
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    @Column
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    //    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL, targetEntity = Content.class)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL, targetEntity = Content.class)
    private List<Content> contents = new ArrayList<>();

    //    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL)
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL, targetEntity = Comment.class)
    private List<Comment> comments = new ArrayList<>();

//
//    //    @ElementCollection(targetClass=Content.class)
//    @ManyToMany(mappedBy = "usersLiked", cascade = CascadeType.ALL, targetEntity = Content.class)
//    private List<Content> contentsLiked = new ArrayList<>();
//
//    @ManyToMany(mappedBy = "usersLiked", cascade = CascadeType.ALL, targetEntity = Comment.class)
//    private List<Comment> commentsLiked = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Column(name = "date")
    private Date date = new Date();

//    @Transient
//    private int contentNumber;

//    @Transient
//    private int rating;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL, targetEntity = Like.class)
    private List<Like> likes = new ArrayList<>();

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date regDate) {
        this.date = date;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public int getContentNumber() {
//        return contentNumber;
//    }
//
//    public void setContentNumber(int contentNumber) {
//        this.contentNumber = contentNumber;
//    }

    public List<Comment> getComments() {
        return comments;
    }



    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public List<Content> getContentsLiked() {
//        return contentsLiked;
//    }
//
//    public void setContentsLiked(List<Content> contentsLiked) {
//        this.contentsLiked = contentsLiked;
//    }
//
//    public List<Comment> getCommentsLiked() {
//        return commentsLiked;
//    }
//
//    public void setCommentsLiked(List<Comment> commentsLiked) {
//        this.commentsLiked = commentsLiked;
//    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
=======
    private Long id;

    private String email;

    private String name;

    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private List<Content> userContentList;

    private Date regDate = new Date();

    @Enumerated (EnumType.STRING)
    private Role role;

    @Transient
    private int contentNumber;

    @Transient
    private int rating;

>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
}
