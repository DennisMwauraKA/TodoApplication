package com.dennis.Todoapplication.controller;

import com.dennis.Todoapplication.dtos.CreateTaskDto;
import com.dennis.Todoapplication.model.JavaTodo;
import com.dennis.Todoapplication.service.JavaTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class JavaTodoController {
    // 3types of dependecy injection
    // field injection
    // setter injection
    //constructor injection


    public JavaTodoController(JavaTodoService service ) {
        this.service = service;

    }

    private final JavaTodoService service;


    // creating task
    @PostMapping("/addTask")
    public ResponseEntity<Integer> createTask(@RequestBody CreateTaskDto createTaskDto) {
        return ResponseEntity.ok(service.createTask(createTaskDto));
    }




}
