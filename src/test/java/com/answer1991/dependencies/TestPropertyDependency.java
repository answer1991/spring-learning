package com.answer1991.dependencies;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyDependency {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void test(){
		PropertyDependency foo = cxt.getBean("propertyDependency", PropertyDependency.class);
		Assert.assertEquals(foo.getProperties().getProperty("name"), "Joe Chen");
		Assert.assertEquals(foo.getProperties().getProperty("id"), "055574");
	}
}
