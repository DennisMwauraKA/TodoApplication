package com.dennis.Todoapplication.dtos;

import com.dennis.Todoapplication.model.TodoStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class CreateTaskDto {
    private Integer id;
    private String title;
    private String content;
    @Enumerated(EnumType.STRING)
    private TodoStatus status;
    private LocalDateTime createdAt;
}
