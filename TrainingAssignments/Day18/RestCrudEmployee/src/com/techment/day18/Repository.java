package com.techment.day18;

import java.util.*;

public class Repository {
	
	static ArrayList <Employee> emp_list = new ArrayList<Employee>();
	static
	{
		emp_list.add(new Employee(1,"Zahra",21,500000,"Manger"));
		emp_list.add(new Employee(2,"Mustafa",25,900000,"HR"));
		emp_list.add(new Employee(3,"Sakina",20,90000,"Developer"));
		emp_list.add(new Employee(4,"Husaini",28,7000000,"Tester"));
	
		
	}

	public List<Employee> getEmployees() {
		return emp_list;
	}
	public String addEmployees(Employee emp)
	{
	
		emp_list.add(emp);
		return "Employee Added";
	}
	public String removeEmployeeById(int id)
	{
		emp_list.remove(id);
		return "Employee having id " + id + " deleted Succesfully";
	}
	public String removeAll()
	{
		emp_list.removeAll(emp_list);
		return "All Employees Removed Succesfully";
	}
	public String updateEmployees(Employee emp)
	{
		emp_list.get(emp.getId()).setName(emp.getName());
		emp_list.get(emp.getId()).setAge(emp.getAge());
		emp_list.get(emp.getId()).setSalary(emp.getSalary());
		emp_list.get(emp.getId()).setDept(emp.getDept());
		System.out.println("After update :" + emp_list);
		return "Updated Succesfully";
	}
	
}
