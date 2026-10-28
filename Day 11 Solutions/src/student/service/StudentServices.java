package student.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import student.dao.*;

import student.model.Student;

public class StudentServices {

	private StudentDao sdao;

	public StudentServices(StudentDao sdao) {
		this.sdao = sdao;
	}

	// Sort by Roll Number - Ascending
	public List<Student> sortByRollNumber() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getRollN() - s2.getRollN();
			}
		});

		return list;
	}

	// Sort by Name - Ascending
	public List<Student> sortByName() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});

		return list;
	}

	// Merit List by Marks - Descending
	public List<Student> meritListByMarks() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return Integer.compare(s2.getMarks(), s1.getMarks());
			}
		});

		return list;
	}

	// Department Ascending + Name Ascending
	public List<Student> sortByDepartmentAndName() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				int deptResult = s1.getDepartment().compareTo(s2.getDepartment());

				if (deptResult != 0) {
					return deptResult;
				}

				return s1.getName().compareTo(s2.getName());
			}
		});

		return list;
	}

	// Department Ascending + Marks Descending
	public List<Student> sortByDepartmentAndMarks() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				int deptResult = s1.getDepartment().compareTo(s2.getDepartment());

				if (deptResult != 0) {
					return deptResult;
				}

				return Integer.compare(s2.getMarks(), s1.getMarks());
			}
		});

		return list;
	}

	// Marks Descending + Roll Number Ascending
	public List<Student> sortByMarksAndRollNumber() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				int marksResult = Integer.compare(s2.getMarks(), s1.getMarks());

				if (marksResult != 0) {
					return marksResult;
				}

				return Integer.compare(s1.getRollN(), s2.getRollN());
			}
		});

		return list;
	}

	// Department Ascending + Marks Descending + Name Ascending
	public List<Student> sortByDepartmentMarksAndName() {

		List<Student> list = new ArrayList<>(sdao.getAllStudents());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				// Department Ascending
				int deptResult = s1.getDepartment().compareTo(s2.getDepartment());

				if (deptResult != 0) {
					return deptResult;
				}

				// Marks Descending
				int marksResult = Integer.compare(s2.getMarks(), s1.getMarks());

				if (marksResult != 0) {
					return marksResult;
				}

				// Name Ascending
				return s1.getName().compareTo(s2.getName());
			}
		});

		return list;
	}
}
