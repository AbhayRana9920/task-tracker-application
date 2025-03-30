package com.javvy.taskbackend.domain.entities.dto;

import com.javvy.taskbackend.domain.entities.TaskPriority;
import com.javvy.taskbackend.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
