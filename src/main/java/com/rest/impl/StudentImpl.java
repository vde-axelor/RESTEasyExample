package com.rest.impl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rest.db.StudentDetail;
import com.rest.service.StudentService;

public class StudentImpl implements StudentService{
	@Inject
	private Provider<EntityManager> em;

	@Transactional
	@Override
	public void addStudent(String fname,String lname,String city,String dob) {
		StudentDetail sd=new StudentDetail(fname,lname,city,dob);
		em.get().persist(sd);
		System.out.println("Name is: "+fname + " "+lname);
		System.out.println("City is: "+city);
		System.out.println("Date Of Birth is: "+dob);
	}
}

