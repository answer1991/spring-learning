package com.answer1991.aspect.pointcut.within;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.answer1991.aspect.LogicalInterface;

public class WithinTester {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("aspect.within.xml");
		this.cxt.registerShutdownHook();
	}

	@Test
	public void test() {
		LogicalInterface bean = this.cxt.getBean("logicalBean", LogicalInterface.class);
		bean.doSomething();
	}
	
	@Test
	public void testSubPackage() {
		LogicalInterface bean = this.cxt.getBean("logicalBean2", LogicalInterface.class);
		bean.doSomething();
	}
}
