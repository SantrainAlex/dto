package com.example.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, length = 255)
    private String content;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private Set<Comments> comments;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
