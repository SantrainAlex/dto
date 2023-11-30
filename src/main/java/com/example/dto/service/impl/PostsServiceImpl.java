package com.example.dto.service.impl;

import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.PostsCreateDto;
import com.example.dto.dto.PostsReadDto;
import com.example.dto.dto.PostsReadDto;
import com.example.dto.model.Comments;
import com.example.dto.model.Posts;
import com.example.dto.repository.CommentsRepository;
import com.example.dto.repository.PostsRepository;
import com.example.dto.service.CommentsService;
import com.example.dto.service.PostsService;
import com.example.dto.utils.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    PostsRepository postsRepository;
    @Autowired
    DtoUtils dtoUtils;

    @Override
    public PostsReadDto createPosts(PostsCreateDto postsCreateDto) {
        Posts posts = dtoUtils.convertToEntity(postsCreateDto, Posts.class);
        Posts posts1 = postsRepository.save(posts);
        return (PostsReadDto) dtoUtils.convertToDto(posts1, PostsReadDto.class);
    }

    @Override
    public PostsReadDto getPostsById(Integer id) {
        return (PostsReadDto) dtoUtils.convertToDto(postsRepository.findById(id).get(), PostsReadDto.class);
    }
}
