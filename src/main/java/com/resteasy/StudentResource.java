package com.resteasy;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class StudentResource {
	@Path("/helloGet")				
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response  helloGet()
	{
		Student st = new  Student(1, "Vishwa", "Desai","Surat");
		return Response.ok(st).build();
	}
//	
	
	@Path("/helloPost")				
	@POST	
	@Produces(MediaType.APPLICATION_JSON)
	public Response  helloPost()
	{
		Student st = new  Student(2, "Tirth", "Vashi","Surat");
		return Response.ok(st).build();
	}
	
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudent(
			int id,String fname,String lname,String city) {
		 id = 3;
		 fname = "Om";
		 lname="Mehta";
		 city = "Valsad";
		
		return Response.status(200).entity("Student id is : " + id +"First Name : " + fname +"Last Name : " + lname + "City : " + city).build();
		
	}
	
    @GET  
    @Path("/{param}")  
    public Response getMsg(@PathParam("param") String name) {  
        String output = "Get Method  Say : Hello " + name;  
        return Response.status(200).entity(output).build();  
    }  
    
    
	    @POST	  			
	    @Path("/create")  
	    public Response create(@FormParam("id") int id,@FormParam("fname") String fname,@FormParam("lname") String lname,@FormParam("city") String city){

		    return Response.status(200)  
		            .entity("Student added successfuly!<br> Id: "+ id+"<br> First name: " + fname+"<br> Last Name: "+lname+"<br> City: "+city)  
		            .build();
	    }
//	   
	@Path("/helloGet/")				
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response  helloGet1()
	{
	
	  List<Student> students = new ArrayList<>();
	   
		  students.add(new Student(1,"Vishwa","Desai","Surat")); 
		  students.add(new Student(2,"Tirth","Vashi","Surat"));
		  students.add(new Student(3,"Om","Mehta","Mumbai"));
		  	
		  return Response.ok(students).build();
		  
	}	  
}
