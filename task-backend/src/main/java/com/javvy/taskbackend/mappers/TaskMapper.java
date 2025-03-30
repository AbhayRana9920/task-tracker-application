package com.javvy.taskbackend.mappers;

import com.javvy.taskbackend.domain.dto.TaskDto;
import com.javvy.taskbackend.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
