package com.example.TaskManager;
import com.sun.source.util.TaskListener;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    //Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    //Add a task
    public Task addTask(String title) {
        Task task = new Task(title);
        return taskRepository.save(task);
    }

    //Mark task as done
    public Task markDone(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not Found"));
        task.setDone(true);
        return taskRepository.save(task);
    }

    //Delete task
    public void deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task with id: " + id + " not found");
        }
        taskRepository.deleteById(id);
    }


}
