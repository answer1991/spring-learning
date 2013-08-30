package com.answer1991.aspect.advice.afterthrowing;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext(
				"aspect.after.throwing.xml");
		this.cxt.registerShutdownHook();
	}

	@Test
	public void test1() {
		TestBean bean = this.cxt.getBean("testBean", TestBean.class);
		try {
			bean.doSomething();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
