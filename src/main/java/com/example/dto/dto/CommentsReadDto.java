package com.example.dto.dto;

import com.example.dto.model.Posts;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CommentsReadDto implements CommentsDto{

    private Long id;
    private String body;
    private String email;
    private String title;
    private Posts post;


}
