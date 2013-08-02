package com.answer1991.dependencies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterDependency {
	private ApplicationContext cxt;

	@Before
	public void init() {
		cxt = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test() {
		SetterDependency foo = cxt.getBean("setterDependency", SetterDependency.class);
		foo.say();
		
		Assert.assertNotNull(foo);
	}
}
