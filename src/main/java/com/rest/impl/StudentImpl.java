package com.rest.impl;

import java.util.List;
import com.rest.db.StudentDetail;
import com.rest.service.StudentService;
import javax.persistence.EntityManager;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class StudentImpl implements StudentService{
	@Inject
	private EntityManager em;
	
	@Inject
	private Provider<EntityManager> emp;
	
	@Override
	public StudentDetail addStudent(String fname, String lname, String city, String dob) {
		return null;
	}

	@Override
	public StudentDetail updateStudent(int id, String fname, String lname, String city, String dob) {
		return null;
	}

	@Override
	public StudentDetail deleteStudent(int id) {
		return null;
	}
	
	@Transactional
	@Override
	public List<StudentDetail> getAllStudent() {
		em = emp.get();
		List<StudentDetail> studentlist = em.createQuery("from studentdetail",StudentDetail.class).getResultList();
		System.out.println(studentlist);

		return studentlist;
	}
	


	@Override
	public StudentDetail getStudentbyid(int id) {
		return null;

	}
}

