package com.answer1991.dependencies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactoryDependency {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testStaticFactoryDependency(){
		StaticFactoryDependency foo = cxt.getBean("staticFactoryDependency", StaticFactoryDependency.class);
		Assert.assertNotNull(foo);
		
		foo.getBar().sayHello();
		foo.getBaz().sayWelcome();
	}
}
