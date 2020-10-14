package org.alex.artspace.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
//@Component
=======
import java.util.Date;

@Entity
@Component
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn (name = "content_id")
    private Content content;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User author;

//    @ManyToMany (fetch = FetchType.LAZY, targetEntity = User.class)
//    @JoinTable (name = "users_comments",
//            joinColumns =  {@JoinColumn (name = "comment_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn (name = "user_id", referencedColumnName = "id")})
//    private List<User> authors = new ArrayList<>();

//    @ManyToMany (fetch = FetchType.LAZY, targetEntity = User.class)
//    @JoinTable (name = "comments_likes",
//            joinColumns =  {@JoinColumn (name = "comment_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn (name = "user_id", referencedColumnName = "id")})
//    private List<User> usersLiked = new ArrayList<>();

=======
    private Content content;

    private User author;

>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
    private Date date = new Date();

    private String text;

<<<<<<< HEAD
    @Transient
    private int rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }


//    public List<User> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<User> authors) {
//        this.authors = authors;
//    }

//    public List<User> getUsersLiked() {
//        return usersLiked;
//    }
//
//    public void setUsersLiked(List<User> usersLiked) {
//        this.usersLiked = usersLiked;
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
=======
    private int rating;

>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
}
