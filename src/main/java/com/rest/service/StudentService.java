package com.rest.service;

import java.util.List;

import com.rest.db.StudentDetail;

public interface StudentService {
	public StudentDetail addStudent(String fname,String lname,String city,String dob);
	public StudentDetail  updateStudent(int id,String fname,String lname,String city,String dob);
	public StudentDetail  deleteStudent(int id);
	List<StudentDetail> getAllStudent();
	public StudentDetail getStudentbyid(int id);
}
