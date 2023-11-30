package com.example.dto.service.impl;

import com.example.dto.dto.CommentsCreateDto;
import com.example.dto.dto.CommentsReadDto;
import com.example.dto.model.Comments;
import com.example.dto.repository.CommentsRepository;
import com.example.dto.service.CommentsService;
import com.example.dto.utils.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsRepository commentsRepository;
    @Autowired
    DtoUtils dtoUtils;

    @Override
    public CommentsReadDto createComments(CommentsCreateDto commentsCreateDto) {
        Comments comments = dtoUtils.convertToEntity(commentsCreateDto, Comments.class);
        Comments comments1 = commentsRepository.save(comments);
        return (CommentsReadDto) dtoUtils.convertToDto(comments1, CommentsReadDto.class);
    }

    @Override
    public CommentsReadDto getCommentsById(Integer id) {
        return (CommentsReadDto) dtoUtils.convertToDto(commentsRepository.findById(id).get(), CommentsReadDto.class);
    }
}
