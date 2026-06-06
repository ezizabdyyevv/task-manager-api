package com.example.TaskManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.List;

@RestController
@RequestMapping("/tasks")


public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    //Post - add a task
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task.getTitle());
    }

    //Put - mark as done
    @PutMapping("/{id}")
    public Task markDone(@PathVariable Long id) {
        return taskService.markDone(id);
    }

    //Delete - delete a task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }




}
