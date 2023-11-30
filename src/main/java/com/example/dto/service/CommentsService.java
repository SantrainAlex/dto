package com.example.dto.service;

import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.CommentsReadDto;

public interface CommentsService {
    CommentsReadDto createComments(CommentsCreateDto comment);
    CommentsReadDto getCommentsById(Integer id);
}
