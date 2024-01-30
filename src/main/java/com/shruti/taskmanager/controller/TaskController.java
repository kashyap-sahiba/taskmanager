package com.shruti.taskmanager.controller;

import com.shruti.taskmanager.model.Task;
import com.shruti.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = taskService.getAllTasks();
       return taskService.getAllTasks();

    }

    @GetMapping("/task/{id}")
    Task getTaskById(Long id){
        return  taskService.getTaskById(id);
    }

    @PostMapping("/savetask")
    Task saveTask(Task task){
        return taskService.saveTask(task);
    }

    @PutMapping("/updatetask")
    Task updateTask(Long id, Task updatedTask){
        return taskService.updateTask(id,updatedTask);
    }

    @DeleteMapping("/deleteTask")
    void deleteTask(Long id){
        taskService.deleteTask(id);
    }
}
