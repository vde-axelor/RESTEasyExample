package com.rest.listner;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.rest.module.StudentModule;

public class StudentListner extends GuiceResteasyBootstrapServletContextListener{
	@Override
	protected List<? extends Module> getModules(ServletContext context) {
		return Arrays.asList(new JpaPersistModule("test"),new StudentModule());

	}
	
	@Override
	protected void withInjector(Injector injector) {
		  injector.getInstance(PersistService.class).start();
	}
}
