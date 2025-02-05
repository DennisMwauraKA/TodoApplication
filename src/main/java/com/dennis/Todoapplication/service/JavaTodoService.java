package com.dennis.Todoapplication.service;

import com.dennis.Todoapplication.dtos.CreateTaskDto;
import com.dennis.Todoapplication.model.JavaTodo;
import com.dennis.Todoapplication.repository.JavaTodoRepo;
import com.dennis.Todoapplication.service.mapper.Mapper;
import org.springframework.stereotype.Service;

@Service


public class JavaTodoService {
    private final Mapper mapper;
    private final JavaTodoRepo repo;

    public JavaTodoService(Mapper mapper, JavaTodoRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }


    public Integer createTask(CreateTaskDto createTaskDto) {
        JavaTodo javaTodo = mapper.toCreateTask(createTaskDto);
        return repo.save(javaTodo).getId();

    }

}
