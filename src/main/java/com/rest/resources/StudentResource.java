package com.rest.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

	
	@POST				//return json formal value
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postEmp(@FormParam("fname") String fname,@FormParam("lname") String lname,@FormParam("city") String city,@FormParam("dob") String dob) {
		ss.addStudent(fname, lname, city, dob);
		return Response.status(200).entity("Added SuccessFully.............").build();
	}
	
}
