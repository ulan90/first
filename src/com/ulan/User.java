package com.ulan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class User {
	private String name="";
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGreeting() {
		if (name.length() == 0) return "";
		else return "Welcome to JSF2 + Ajax, " + name + "! " + password;
	}
}
