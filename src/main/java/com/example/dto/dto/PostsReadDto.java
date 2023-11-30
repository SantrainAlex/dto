package com.example.dto.dto;

import com.example.dto.model.Comments;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class PostsReadDto implements PostsDto{
    private Long id;
    private String content;
    private String description;
    private String title;
    private Set<Comments> comments;
}
