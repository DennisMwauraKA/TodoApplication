package com.dennis.Todoapplication.repository;

import com.dennis.Todoapplication.model.JavaTodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaTodoRepo extends JpaRepository<JavaTodo, Integer> {
}
