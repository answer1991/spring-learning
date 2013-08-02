package com.answer1991;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLoad {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testLoad(){
		Hello hello = cxt.getBean("hello", Hello.class);
		System.out.println(hello.getName());
	}
}
