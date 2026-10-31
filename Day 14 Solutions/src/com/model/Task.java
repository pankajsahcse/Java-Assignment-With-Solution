package com.model;

import java.util.Objects;

public class Task {
    private int taskId;
    private String taskName;
    private boolean isCompleted;

    public Task(int taskId, String taskName) {
        this.taskId=taskId;
        this.taskName=taskName;
        this.isCompleted=false;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName=taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted=completed;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Task task=(Task)o;
        return taskId==task.taskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    @Override
    public String toString() {
        return "Task[ID: " + taskId + ", Name: " + taskName + ", Completed: " + isCompleted + "]";
    }
}
