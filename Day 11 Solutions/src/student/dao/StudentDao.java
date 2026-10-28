package student.dao;

import student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	List<Student> studentList = new ArrayList<>();

	public void addStudentData(Student student) {
		studentList.add(student);
	}

	public List<Student> getAllStudents() {
		return studentList;
	}

}
