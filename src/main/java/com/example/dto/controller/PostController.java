package com.example.dto.controller;

import com.example.dto.dto.PostsCreateDto;
import com.example.dto.dto.PostsReadDto;
import com.example.dto.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @Autowired
    PostsService postsService;

    @PostMapping
    public ResponseEntity<PostsReadDto> post(@RequestBody PostsCreateDto postsDto){
        return new ResponseEntity<PostsReadDto>(postsService.createPosts(postsDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostsReadDto> post(@PathVariable("id") Integer id){
        return new ResponseEntity<PostsReadDto>(postsService.getPostsById(id), HttpStatus.OK);
    }
}
