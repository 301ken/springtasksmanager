package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getallTasks(){
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(int id){
        tasks.removeIf(task -> task.getId() == id);
    }
}