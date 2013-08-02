package com.answer1991.autowiring.rule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OtherMethodAutowiredBean {
	private PropertyOne propertyOne;
	private IProperty propertyTwo;

	@Autowired
	public void prepare(PropertyOne one, @Qualifier("main")IProperty two) {
		this.propertyOne = one;
		this.propertyTwo = two;
	}
	
	public PropertyOne getPropertyOne() {
		return propertyOne;
	}
	public void setPropertyOne(PropertyOne propertyOne) {
		this.propertyOne = propertyOne;
	}
	public IProperty getPropertyTwo() {
		return propertyTwo;
	}
	public void setPropertyTwo(IProperty propertyTwo) {
		this.propertyTwo = propertyTwo;
	}
	
}
