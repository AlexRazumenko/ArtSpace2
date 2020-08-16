package org.alex.artspace.entity;

import org.alex.artspace.Role;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Component
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

}
