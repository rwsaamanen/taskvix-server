package com.taskvix.taskvix.api;

import com.taskvix.taskvix.domain.TaskDTO;
import com.taskvix.taskvix.domain.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService tasksService;

    @GetMapping
    public List<TaskDTO> getTasks() {
        return tasksService.getTasks();
    }
}
