package com.answer1991.autowiring.rule;

import org.springframework.beans.factory.annotation.Autowired;

public class MethodAutowiredBean {
	private PropertyOne property;

	public PropertyOne getProperty() {
		return property;
	}

	@Autowired
	public void setProperty(PropertyOne property) {
		this.property = property;
	}
}
