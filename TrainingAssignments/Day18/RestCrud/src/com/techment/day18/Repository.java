package com.techment.day18;

import java.util.*;

public class Repository {

	static ArrayList <Student> student_list = new ArrayList <Student>();

	static
	{
		student_list.add(new Student(1,"Sachin","hr"));
		student_list.add(new Student(2,"Zahra","dev"));
		student_list.add(new Student(3,"Rahul","manager"));
	}

	public List<Student> getAll()
	{
		return student_list;
	}

	public String addStudent(Student stu) {
		student_list.add(stu);
		return " Student added " ;
	}
	public String deleteStudent(int id)
	{
		student_list.remove(id);
		return "Student Deleted";
	}

	public String update(Student stu)
	{
		student_list.get(stu.getId()).setName(stu.getName());
		student_list.get(stu.getId()).setDept(stu.getDept());
		System.out.println("After update :" + student_list);
		return "Student Updated";
	}
}
