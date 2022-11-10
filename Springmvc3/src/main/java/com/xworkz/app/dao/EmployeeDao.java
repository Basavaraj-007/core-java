package com.xworkz.app.dao;

import com.xworkz.app.dto.Employee;

public interface EmployeeDao {

	public Employee save(Employee employee);
	public Employee searchByEmployeeFirstName(String firstname);
}
