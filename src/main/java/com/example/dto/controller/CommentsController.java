package com.example.dto.controller;

import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.CommentsReadDto;
import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.CommentsReadDto;
import com.example.dto.service.CommentsService;
import com.example.dto.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentsController {
    @Autowired
    CommentsService commentsService;

    @PostMapping
    public ResponseEntity<CommentsReadDto> post(@RequestBody CommentsCreateDto postsDto){
        return new ResponseEntity<CommentsReadDto>(commentsService.createComments(postsDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentsReadDto> post(@PathVariable("id") Integer id){
        return new ResponseEntity<CommentsReadDto>(commentsService.getCommentsById(id), HttpStatus.OK);
    }
}
