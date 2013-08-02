package com.answer1991.bean.processor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBeanPostProcessor {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("bean.processor.xml");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		
	}
}
