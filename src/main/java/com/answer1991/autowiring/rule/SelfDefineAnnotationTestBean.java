package com.answer1991.autowiring.rule;

import org.springframework.beans.factory.annotation.Autowired;

public class SelfDefineAnnotationTestBean {
	@Autowired
	@SelfDefineAnnotation("hello")
	private IProperty property;

	public IProperty getProperty() {
		return property;
	}

	public void setProperty(IProperty property) {
		this.property = property;
	}
	
	
}
