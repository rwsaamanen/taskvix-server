package com.taskvix.taskvix.domain;

import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    public TaskDTO toDTO(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setColumn(task.getColumn());
        dto.setCreatedAt(task.getCreatedAt());
        return dto;
    }
}
