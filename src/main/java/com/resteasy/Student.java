package com.resteasy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Student {
	private int id;
	private String fname,lname;
	private String city;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String fname, String lname,String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city=city;
	}
}
