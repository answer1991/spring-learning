package com.answer1991.dependencies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDependency {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testConstructorDependency(){
		FooConstructorDependency foo = cxt.getBean("fooConstructorDependency", FooConstructorDependency.class);
		Assert.assertNotNull(foo);
		foo.say();
	}
	
	@Test
	public void testConstructorWithIndex(){
		ConstructorDependencyWithIndex cdwi = cxt.getBean("constructorDependencyWithIndex", ConstructorDependencyWithIndex.class);
		cdwi.sayName();
	}
}
