package com.answer1991.bean.wrapper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanWrapper {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("bean.processor.xml");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		BeanWrapper companyWrapper = new BeanWrapperImpl(new Company());
		companyWrapper.setPropertyValue("name", "IBM");
		
		BeanWrapper employWrapper = new BeanWrapperImpl(Employee.class);
		employWrapper.setPropertyValue("name", "Joe Chen");
		PropertyValue salary = new PropertyValue("salary", 3500.0);
		employWrapper.setPropertyValue(salary);
		
		companyWrapper.setPropertyValue("boss", employWrapper.getWrappedInstance());
		
		Company company = (Company) companyWrapper.getWrappedInstance();
		
		Assert.assertEquals(3500.0, company.getBoss().getSalary(), 0);
		
		companyWrapper.setPropertyValue("boss.salary", 4500);
		Assert.assertEquals(4500.0, company.getBoss().getSalary(), 0);
	}
}
