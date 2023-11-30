package com.example.dto.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments")
public class Comments {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "body", nullable = false, length = 255)
    private String body;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "name", nullable = false, length = 255)
    private String title;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Posts post;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
