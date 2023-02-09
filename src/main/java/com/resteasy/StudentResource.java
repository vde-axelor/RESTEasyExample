package com.resteasy;

import java.io.IOException;
import java.lang.annotation.Target;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class StudentResource {
//	@Path("/helloGet")				//1.
//	@GET	
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response  helloGet()
//	{
//		Student st = new  Student(1, "Vishwa", "Desai","Surat");
//		return Response.ok(st).build();
//	}
//	
	
//	@Path("/helloPost")				//2.
//	@POST	
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response  helloPost()
//	{
//		Student st = new  Student(2, "Tirth", "Vashi","Surat");
//		return Response.ok(st).build();
//	}
	
	
//	@POST
//	@Path("/add")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addStudent(
//			int id,String fname,String lname,String city) {
//		 id = 3;
//		 fname = "Om";
//		 lname="Mehta";
//		 city = "Valsad";
//		
//		return Response.status(200).entity("Student id is : " + id +"First Name : " + fname +"Last Name : " + lname + "City : " + city).build();
//		
//	}
	
//    @GET  
//    @Path("/{param}")  
//    public Response getMsg(@PathParam("param") String msg) {  
//        String output = "Get Method  Say : " + msg;  
//        return Response.status(200).entity(output).build();  
//    }  
//    
    
	
//	
//	    @POST	  			//working as post Method
//	    @Path("/create")  
//	    public Response create(@FormParam("id") int id,@FormParam("fname") String fname,@FormParam("lname") String lname,@FormParam("city") String city){
//
//		    return Response.status(200)  
//		            .entity("Student added successfuly!<br> Id: "+ id+"<br> First name: " + fname+"<br> Last Name: "+lname+"<br> City: "+city)  
//		            .build();
//	    }
//	   
//	@Path("/helloGet/")				//1.
//	@GET	
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response  helloGet()
//	{
//	
//	  List<Student> students = new ArrayList<>();
//	   
//		  students.add(new Student(1,"Vishwa","Desai","Surat")); 
//		  students.add(new Student(2,"Tirth","Vashi","Surat"));
//		  students.add(new Student(3,"Om","Mehta","Mumbai"));
//		  	
//		  return Response.ok(students).build();
//		  
//	}	  
//	
//	
//	
	  @PUT
	  @Path("/{id}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response updatestudent(@PathParam("id") int id)
	  {
		  Student student = new Student(id, "Vishwa","Desai","surat");
		return Response.status(200).entity(student).build();		  
	  }
//	  
	  
//	  @PUT
//	  @Path("{id}")
//	  public Response updateStudent(@PathParam("id") int id) {
//	      Student student = new Student(id, "Jane","Doe");
//	      return Response.status(200).entity(student).build();
//	  }

	  
//
//	    @Path("/{id}")
//	    @DELETE
//	    @Produces(MediaType.APPLICATION_JSON)
//	    public Response deleteUser(@PathParam("id") int id) {
//	        boolean result = Student.delete(id);

//	        if (result) {
//	            return Response.ok().status(Response.Status.NO_CONTENT).build();
//	        } else {
//	            return Response.notModified().build();
//	        }
//	    }
}
