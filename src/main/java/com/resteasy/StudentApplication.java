package com.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/restapi")
public class StudentApplication extends Application {
	private Set<Object> singletons = new HashSet<>();

	public StudentApplication () {
	this.singletons.add(new StudentResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
