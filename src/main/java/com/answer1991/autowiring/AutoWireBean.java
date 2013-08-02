package com.answer1991.autowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWireBean {
	@Autowired
	private AutoWireProperty autoWireProperty;

	public AutoWireProperty getAutoWireProperty() {
		return autoWireProperty;
	}

	public void setAutoWireProperty(AutoWireProperty autoWireProperty) {
		this.autoWireProperty = autoWireProperty;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void clearup() {
		System.out.println("clearup");
	}
}
