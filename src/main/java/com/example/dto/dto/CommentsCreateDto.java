package com.example.dto.dto;

import com.example.dto.model.Posts;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentsCreateDto implements CommentsDto {
    private String body;
    private String email;
    private String title;
    private Posts post;
}
