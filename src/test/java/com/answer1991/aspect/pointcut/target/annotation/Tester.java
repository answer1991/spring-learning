package com.answer1991.aspect.pointcut.target.annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.answer1991.aspect.LogicalInterface;

public class Tester {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("aspect.target.annotation.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void tester() {
		LogicalInterface bean = this.cxt.getBean("logicalBean2", LogicalInterface.class);
		bean.doSomething();
	}
}
