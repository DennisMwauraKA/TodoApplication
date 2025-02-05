package com.dennis.Todoapplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JavaTodo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String content;
    @Enumerated(EnumType.STRING)
    private TodoStatus status;
    private LocalDateTime createdAt;

}
