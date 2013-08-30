package com.answer1991.aspect.advice.before;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.answer1991.aspect.LogicalInterface;

public class Tester {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("aspect.before.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test1() {
		LogicalInterface bean = this.cxt.getBean("logicalBean", LogicalInterface.class);
		bean.doSomething();
	}
}
