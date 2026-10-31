package com.service;

import java.util.Set;

import com.dao.StudentDaoImpl;
import com.model.Student;


public class StudentService {
    private StudentDaoImpl studentDao=new StudentDaoImpl();

    public boolean addStudent(Student student) {
        boolean added=studentDao.add(student);
        if(!added) System.out.println("Duplicate: Student with Roll No " + student.getRollNo() + " already exists.");
        return added;
    }

    public Student searchByRollNo(int rollNo) {
        return studentDao.findByRollNo(rollNo);
    }

    public boolean updateStudent(int rollNo, String name, double marks) {
        return studentDao.update(rollNo, name, marks);
    }

    public boolean deleteStudent(int rollNo) {
        return studentDao.delete(rollNo);
    }

    public boolean studentExists(int rollNo) {
        return studentDao.exists(rollNo);
    }

    public void displayAll() {
        Set<Student> all=studentDao.getAll();
        for(Student s : all) {
            System.out.println(s);
        }
    }
}
