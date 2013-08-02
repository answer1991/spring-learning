package com.answer1991.spring.el;

import java.util.Date;
import java.util.List;
import java.util.Properties;

public class Inventor {
	private String name;
	private Date date;
	private String country;
	private List<String> inventions;
	private Properties birthdate;
	
	public Inventor() {
		
	}
	
	public Inventor(String name, Date birth, String country) {
		this.name = name;
		this.date = birth;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getInventions() {
		return inventions;
	}

	public void setInventions(List<String> inventions) {
		this.inventions = inventions;
	}

	public Properties getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Properties birthdate) {
		this.birthdate = birthdate;
	}
}
