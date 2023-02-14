package com.rest.impl;

import java.util.List;
import com.rest.db.StudentDetail;
import com.rest.service.StudentService;
import javax.persistence.EntityManager;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class StudentImpl implements StudentService {
	@Inject
	private EntityManager em;

	@Inject
	private Provider<EntityManager> emp;

	@Transactional
	@Override
	public void addStudent(String fname, String lname, String city,String dob) {
		StudentDetail sd = new StudentDetail(fname, lname, city,dob);
		emp.get().persist(sd);
		System.out.println("Your first name is : " + sd.getFname());
		System.out.println("Your Last name is : " + sd.getLname());
		System.out.println("Your City name is : " + sd.getCity());
		System.out.println("Your Date Of Birth is : " + sd.getDob());
	}

	@Override
	public void deleteStudent(int id) {
		em.getTransaction().begin();
		StudentDetail sd = em.find(StudentDetail.class, id);
		em.remove(sd);
		em.getTransaction().commit();
		System.out.println("Your id is :" + id);
	}

	@Override
	public void updateStudent(int id, String fname, String lname, String city,String dob) {
		em.getTransaction().begin();
		em = emp.get();
		StudentDetail sd = em.find(StudentDetail.class, id);
		sd.setFname(fname);
		sd.setLname(lname);
		sd.setCity(city);
		sd.setDob(dob);
		em.getTransaction().commit();

	}

	@Transactional
	@Override
	public List<StudentDetail> getAllStudent() {

		em = emp.get();
		List<StudentDetail> studentList = em.createQuery("from studentdetail", StudentDetail.class).getResultList();
		return studentList;
	}

	@Override
	public StudentDetail getStudentbyid(int id) {
		em = emp.get();
		StudentDetail sd = em.find(StudentDetail.class, id);
		return sd;
	}

}
