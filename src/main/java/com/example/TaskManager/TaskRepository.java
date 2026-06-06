package com.example.TaskManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // No code needed here!
    // JpaRepository gives us these for free:
    // save(), findAll(), findById(), deleteById(), existsById()
}


