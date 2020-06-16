package com.techment.day18;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/studentAPI")
public class StudentRestfulAPI {

	@GET
	@Path("/getStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent()
	{
		Repository r = new Repository();
		return r.getAll();
	}
	
	@POST
	@Path("/addStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public String addStudent(Student stu)
	{
		Repository r = new Repository();
		return r.addStudent(stu);
	}
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteStudent(@QueryParam("id") int id)
	{
		Repository r = new Repository();
		return r.deleteStudent(id);
	}
	
	@PUT
	@Path("/update")
	public String updateStudent(Student stu)
	{
		Repository r = new Repository();
		return r.update(stu);
	}
	
	
	
}
