package com.rest.module;

import com.google.inject.AbstractModule;
import com.rest.impl.StudentImpl;
import com.rest.service.StudentService;
import com.rest.resources.StudentResource;

public class StudentModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(StudentService.class).to(StudentImpl.class);
	}

}
