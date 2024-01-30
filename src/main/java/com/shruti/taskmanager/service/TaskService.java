package com.shruti.taskmanager.service;

import com.shruti.taskmanager.model.Task;
import com.shruti.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task saveTask(Task task);

    Task updateTask(Long id, Task updatedTask);

    void deleteTask(Long id);
}
