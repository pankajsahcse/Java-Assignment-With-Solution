package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db.DBConnection;
import com.model.Employee;

public class EmployeeDao {

	Connection con = DBConnection.getConnection();

	public EmployeeDao() {

	}

	public void addEmployee(Employee e) {

		String q = "INSERT INTO employee (name, dept, salary) VALUES(?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, e.getEmpName());
			ps.setString(2, e.getDept());
			ps.setDouble(3, e.getSalary());

			int i = ps.executeUpdate();

			if (i == 1) {
				System.out.println("Employee save successfully in DB");
			} else {
				System.out.println("Something went wrong on server");
			}

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

	// display data of emp
	public List<Employee> displayEmployeeData() {

		List<Employee> emplist = new ArrayList<>();

		String q = "SELECT * FROM employee";

		try {

			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				double salary = rs.getDouble("salary");

				Employee e = new Employee(id, name, dept, salary);
				emplist.add(e);
			}

		} catch (Exception e) {

		}
		return emplist;
	}

	public Employee searchEmpById(int id) {

		Employee e = null;

		String q = "SELECT * FROM employee WHERE id = ?";

		try {

			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(id, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				double salary = rs.getDouble("salary");
				e = new Employee(id, name, dept, salary);

			}

		} catch (Exception e2) {
			// TODO: handle exception
		}

		return e;

	}

	public boolean deleteEmpById(int id) {

		String q = "DELETE FROM employee WHERE id = ?";
		try {

			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(id, id);

			int i = ps.executeUpdate();

			if (i == 1) {

				return true;
			}

		} catch (Exception e2) {
			// TODO: handle exception
		}

		return false;
	}

	public boolean updateEmpById(int id) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter updated Name");
		String uName = sc.next();

		System.out.println("Enter updated dept");
		String udept = sc.next();

		System.out.println("Enter updated salary");
		Double sal = sc.nextDouble();

		String q = "UPDATE employee SET name = ?, dept = ?, salary = ? WHERE id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(q);

			ps.setInt(4, id);
			ps.setString(1, uName);
			ps.setString(2, udept);
			ps.setDouble(3, sal);

			int i = ps.executeUpdate();

			if (i == 1) {
				return true;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		sc.close();
		return false;
	}

}
