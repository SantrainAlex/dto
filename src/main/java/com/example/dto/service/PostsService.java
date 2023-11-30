package com.example.dto.service;

import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.CommentsReadDto;
import com.example.dto.dto.PostsCreateDto;
import com.example.dto.dto.PostsReadDto;

public interface PostsService {
    PostsReadDto createPosts(PostsCreateDto post);
    PostsReadDto getPostsById(Integer id);
}
