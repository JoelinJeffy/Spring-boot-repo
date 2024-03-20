package com.example.todolist.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class ListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String tasks;
    @Column
    private String taskStatus;

    public ListEntity() {
    }

    public ListEntity(String tasks, String taskStatus) {
        this.tasks = tasks;
        this.taskStatus = taskStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
