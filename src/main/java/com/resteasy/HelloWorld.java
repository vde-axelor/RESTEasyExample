package com.resteasy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloWorld {
	private String message;


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public HelloWorld() {
		super();
		
	}
}
