package com.answer1991.autowiring.rule;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SetPropertyTestBean {
	@Autowired
	@Qualifier("backup")
	private Set<IProperty> properties;

	public Set<IProperty> getProperties() {
		return properties;
	}

	public void setProperties(Set<IProperty> properties) {
		this.properties = properties;
	}
}
