package com.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Student;

public class StudentDaoImpl {
	private Set<Student> studentSet = new HashSet<>();

	public boolean add(Student student) {
		return studentSet.add(student);
	}

	public Student findByRollNo(int rollNo) {
		for (Student s : studentSet) {
			if (s.getRollNo() == rollNo)
				return s;
		}
		return null;
	}

	public boolean update(int rollNo, String name, double marks) {
		Student s = findByRollNo(rollNo);
		if (s != null) {
			s.setName(name);
			s.setMarks(marks);
			return true;
		}
		return false;
	}

	public boolean delete(int rollNo) {
		Iterator<Student> it = studentSet.iterator();
		while (it.hasNext()) {
			if (it.next().getRollNo() == rollNo) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public boolean exists(int rollNo) {
		return findByRollNo(rollNo) != null;
	}

	public Set<Student> getAll() {
		return new HashSet<>(studentSet);
	}
}
