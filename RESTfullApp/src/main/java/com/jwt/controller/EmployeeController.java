package com.jwt.controller;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jwt.model.Employee;
import com.jwt.service.EmployeeService;
  
@Path("/empService")
public class EmployeeController {
  
    @GET
    @Path("/{empId}")
    public Response getEmpDetails(@PathParam("empId") Integer empId) {
    	Employee emp = EmployeeService.getEmpDetails(empId);
        return Response.status(200).entity(emp.toString()).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/addEmp")
    public Response addEmployee(Employee emp) {
    	Employee rs = EmployeeService.addEmployeeDetails(emp);
    	return Response.status(200).entity(rs.toString()).build();
    }
    
    @POST
    @Path("/updateEmp")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response updateEmployee(Employee emp) {
    	Employee rs = EmployeeService.updateEmployeeDetails(emp);
    	return Response.status(200).entity(rs.toString()).build();
    }
  
}