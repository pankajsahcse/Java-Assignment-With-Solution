package com.test;

import com.model.Student;
import com.model.Task;
import com.service.StudentService;
import com.service.TaskService;

public class TestHashSetManagement {
    public static void main(String[] args) {
        StudentService studentService=new StudentService();

        studentService.addStudent(new Student(101, "Pankaj", 88.5));
        studentService.addStudent(new Student(102, "Raaz", 92.0));
        studentService.addStudent(new Student(103, "POJO", 74.5));

        System.out.println("Testing Duplicate Prevention:");
        studentService.addStudent(new Student(101, "Aarav Duplicate", 99.0));

        System.out.println("\nAll Students:");
        studentService.displayAll();

        System.out.println("\nSearch Student Roll 102 exists: " + studentService.studentExists(102));
        System.out.println("Search Student Roll 999 exists: " + studentService.studentExists(999));

        System.out.println("\nUpdate Student Roll 103:");
        studentService.updateStudent(103, "Charan Updated", 80.0);
        System.out.println(studentService.searchByRollNo(103));

        System.out.println("\nDelete Student Roll 101:");
        studentService.deleteStudent(101);

        System.out.println("\nAll Students after delete:");
        studentService.displayAll();

        System.out.println("\n--- Task Management using HashSet ---");
        TaskService taskService=new TaskService();

        taskService.addTask(new Task(1, "Read Core Java Chapter"));
        taskService.addTask(new Task(2, "Practice Collections"));
        taskService.addTask(new Task(3, "Solve HackerRank problems"));

        System.out.println("Testing Duplicate Task Prevention:");
        taskService.addTask(new Task(1, "Duplicate Task"));

        System.out.println("\nAll Tasks:");
        taskService.displayAllTasks();

        System.out.println("\nSearch Task ID 2: " + taskService.searchTask(2));

        System.out.println("\nMark Task 1 Completed...");
        taskService.markCompleted(1);

        System.out.println("\nPending Tasks:");
        taskService.displayPendingTasks();

        System.out.println("\nRemove Task 2...");
        taskService.removeTask(2);

        System.out.println("\nAll Tasks after removal:");
        taskService.displayAllTasks();
    }
}
