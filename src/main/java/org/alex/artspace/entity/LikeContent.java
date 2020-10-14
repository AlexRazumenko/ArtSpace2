package org.alex.artspace.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_contents")
public class LikeContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    User user;





}
