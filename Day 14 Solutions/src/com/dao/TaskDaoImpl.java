package com.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Task;


public class TaskDaoImpl {
    private Set<Task> taskSet=new HashSet<>();

    public boolean add(Task task) {
        return taskSet.add(task);
    }

    public boolean remove(int taskId) {
        Iterator<Task> it=taskSet.iterator();
        while(it.hasNext()) {
            if(it.next().getTaskId()==taskId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean markCompleted(int taskId) {
        for(Task t : taskSet) {
            if(t.getTaskId()==taskId) {
                t.setCompleted(true);
                return true;
            }
        }
        return false;
    }

    public Task findByTaskId(int taskId) {
        for(Task t : taskSet) {
            if(t.getTaskId()==taskId) return t;
        }
        return null;
    }

    public boolean exists(int taskId) {
        return findByTaskId(taskId)!=null;
    }

    public Set<Task> getPendingTasks() {
        Set<Task> pending=new HashSet<>();
        for(Task t : taskSet) {
            if(!t.isCompleted()) pending.add(t);
        }
        return pending;
    }

    public Set<Task> getAll() {
        return new HashSet<>(taskSet);
    }
}
