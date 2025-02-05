package com.dennis.Todoapplication.service.mapper;

import com.dennis.Todoapplication.dtos.CreateTaskDto;
import com.dennis.Todoapplication.model.JavaTodo;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public JavaTodo toCreateTask(CreateTaskDto createTaskDto) {
        return JavaTodo.builder()
                .id(createTaskDto.getId())
                .title(createTaskDto.getTitle())
                .content(createTaskDto.getContent())
                .createdAt(createTaskDto.getCreatedAt())

                .build();

    }
}
