package com.resteasy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloWorld {
	private String name;
	private String city;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public HelloWorld(String name,String city) {
		super();
		this.name=name;
		this.city=city;
	}
}
