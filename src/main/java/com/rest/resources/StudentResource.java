package com.rest.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.rest.db.StudentDetail;
import com.rest.service.StudentService;

@Path("/student")
public class StudentResource {
	
	@Inject
	StudentService ss;
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response testMethod() {
		return Response.ok("Hello World").build();
	}
	
	@GET
	@Path("/st")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudent() {
		StudentDetail sd=new StudentDetail();
		sd.setFname("test");
		sd.setLname("test");
		sd.setCity("test");
		sd.setDob("3-2-2001");
		return Response.ok(sd).build();
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(@FormParam("fname") String fname, @FormParam("lname") String lname,
			@FormParam("city") String city,@FormParam("dob") String dob) {
		ss.addStudent(fname, lname, city,dob);
		return Response.status(200).entity("Added ..............").build();

	}
	
	@GET		//return view page
	@Path("/list")
//	@Produces(MediaType.APPLICATION_JSON)
	public View GetValue() {
		  List<StudentDetail> list = ss.getAllStudent();
       return new View("/display.jsp",list,"List");
	}			
	
	
	@GET 					
	@Path("/list/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response GetStudentbyid(@PathParam("id") Integer id) {
		StudentDetail sd = ss.getStudentbyid(id);
		return Response.ok(sd).build();
	}
	

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser1(@FormParam("fname") String fname, @FormParam("lname") String lname,
			@FormParam("city") String city ,@FormParam("dob") String dob) {
		ss.addStudent(fname, lname, city,dob);
		return Response.status(200).entity("Added SuccessFullly!!!").build();
	}


	
	
	@Path("/delete/{id}")	
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	public Response deleteUser(@PathParam("id") Integer id) {
		ss.deleteStudent(id);
		return Response.status(200).entity("Deleted SuccessFullly!!!").build();
	}

	@Path("/update/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("id") int id, @FormParam("fname") String fname,
			@FormParam("lname") String lname, @FormParam("city") String city,@FormParam("dob") String dob) {
		ss.updateStudent(id, fname, lname, city,dob);
		return Response.status(Response.Status.OK).build();
	}
}
