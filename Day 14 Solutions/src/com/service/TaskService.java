package com.service;

import java.util.Set;

import com.dao.TaskDaoImpl;
import com.model.Task;


public class TaskService {
    private TaskDaoImpl taskDao=new TaskDaoImpl();

    public boolean addTask(Task task) {
        boolean added=taskDao.add(task);
        if(!added) System.out.println("Duplicate: Task with ID " + task.getTaskId() + " already exists.");
        return added;
    }

    public boolean removeTask(int taskId) {
        return taskDao.remove(taskId);
    }

    public boolean markCompleted(int taskId) {
        return taskDao.markCompleted(taskId);
    }

    public boolean searchTask(int taskId) {
        return taskDao.exists(taskId);
    }

    public void displayPendingTasks() {
        Set<Task> pending=taskDao.getPendingTasks();
        for(Task t : pending) {
            System.out.println(t);
        }
    }

    public void displayAllTasks() {
        Set<Task> all=taskDao.getAll();
        for(Task t : all) {
            System.out.println(t);
        }
    }
}
