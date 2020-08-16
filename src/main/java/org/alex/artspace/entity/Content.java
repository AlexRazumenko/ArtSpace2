package org.alex.artspace.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Component
@Table(name = "content")
public abstract class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User author;

    @Enumerated(EnumType.STRING)
    private ContentType type;

    private String title;

    private String description;

    private Map<Integer, Integer> votesMap = new HashMap<>();

    private double rating;

}
