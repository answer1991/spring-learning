package com.answer1991.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testStaticFactory(){
		StaticFactory.InnerClassOfStaticFactory innerClass = cxt.getBean("innerClassOfStaticFactory", StaticFactory.InnerClassOfStaticFactory.class);
		Assert.assertNotNull(innerClass);
	}
	
	@Test
	public void testCommonFactory(){
		CommonFactory.InnerClassOfCommonFactory innerClass = cxt.getBean("innerClassOfCommonFactory", CommonFactory.InnerClassOfCommonFactory.class);
		Assert.assertNotNull(innerClass);
	}
}
