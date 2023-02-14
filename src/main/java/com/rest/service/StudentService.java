package com.rest.service;

import java.util.List;

import com.rest.db.StudentDetail;

public interface StudentService {
	void addStudent(String fname,String lname,String city,String dob);
	void  updateStudent(int id,String fname,String lname,String city,String dob);
	void  deleteStudent(int id);
	List<StudentDetail> getAllStudent();
	public StudentDetail getStudentbyid(int id);
}
