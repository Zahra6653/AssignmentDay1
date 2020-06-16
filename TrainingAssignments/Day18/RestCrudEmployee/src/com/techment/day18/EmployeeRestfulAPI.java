package com.techment.day18;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeRestfulAPI {

	@GET
	@Path("/getEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployee()
	{
		Repository repos = new Repository();
		return repos.getEmployees();
	}
	
	@POST
	@Path("/addEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public String addEmployee(Employee emp)
	{
		Repository repos = new Repository();
		return repos.addEmployees(emp);
	}
	
	@DELETE
	@Path("/deletebyid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteEmployeeById(@QueryParam("id") int id)
	{
		Repository repos = new Repository();
		return repos.removeEmployeeById(id);
	}
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteAllEmployee()
	{
		Repository repos = new Repository();
		return repos.removeAll();
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateEmployee(Employee emp)
	{
		Repository repos = new Repository();
		return repos.updateEmployees(emp);
	}
	
	
}
