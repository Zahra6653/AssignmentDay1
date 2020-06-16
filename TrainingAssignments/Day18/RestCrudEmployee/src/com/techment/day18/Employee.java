package com.techment.day18;

public class Employee {
	
	private int id, salary , age;
	private String name, dept;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int age, int salary, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id +", name= " + name + " , age= " + age + ", salary=" + salary +  ", dept=" + dept + "]";
	}

	
}
