package org.alex.artspace.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.*;

@Entity
@Component
@Table(name = "contents")
//@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @ManyToOne //(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private User author;

//    @ManyToMany (fetch = FetchType.LAZY, targetEntity = User.class)
//    @JoinTable (name = "users_contents",
//            joinColumns =  {@JoinColumn (name = "content_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn (name = "user_id", referencedColumnName = "id")})
//    private List<User> authors = new ArrayList<>();

    @Enumerated(EnumType.STRING)
//    @Column(name = "type")
    private ContentType type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "text")
    private String text;

    @Column(name = "date")
    private Date date = new Date();

//    private Map<Integer, Integer> votesMap = new HashMap<>();

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, targetEntity = Comment.class)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, targetEntity = Like.class)
    private List<Like> likes = new ArrayList<>();


//    @ManyToMany (fetch = FetchType.LAZY, targetEntity = User.class)
//    @JoinTable (name = "contents_likes",
//            joinColumns =  {@JoinColumn (name = "content_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn (name = "user_id", referencedColumnName = "id")})
//    private List<User> usersLiked = new ArrayList<>();

//    @Transient
//    private double rating;

    //for further media content implementation
    //private File file;


    public Content() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public ContentType getType() {
        return type;
    }

    public void setType(ContentType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    //    public List<User> getUsersLiked() {
//        return usersLiked;
//    }
//
//    public void setUsersLiked(List<User> usersLiked) {
//        this.usersLiked = usersLiked;
//    }

    //    public Map<Integer, Integer> getVotesMap() {
//        return votesMap;
//    }
//
//    public void setVotesMap(Map<Integer, Integer> votesMap) {
//        this.votesMap = votesMap;
//    }

//    public double getRating() {
//        return rating;
//    }
//
//    public void setRating(double rating) {
//        this.rating = rating;
//    }
}
