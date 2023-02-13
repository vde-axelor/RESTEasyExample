
package com.rest.impl;


import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
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
		System.out.println("added");
	}
}

