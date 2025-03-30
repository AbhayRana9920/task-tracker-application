package com.javvy.taskbackend.mappers;

import com.javvy.taskbackend.domain.dto.TaskListDto;
import com.javvy.taskbackend.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
