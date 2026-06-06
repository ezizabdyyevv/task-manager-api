package com.example.TaskManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean isDone;

    public Task(){};

    public Task(String title) {
        this.title = title;
        this.isDone = false;

    }

    public Long getId() {return id; }
    public String getTitle() {return title; }
    public boolean isDone() {return isDone; }


    public void setId(Long id) {this.id = id; }
    public void setTitle(String title) {this.title = title; }
    public void setDone (boolean isDone) {this.isDone = isDone; }



}
