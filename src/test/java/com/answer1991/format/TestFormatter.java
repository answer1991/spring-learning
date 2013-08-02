package com.answer1991.format;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFormatter {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("formatter.xml");
		cxt.registerShutdownHook();
	}

	@Test
	public void test() {
		TestBean testBean = this.cxt.getBean("testBean", TestBean.class);
		System.out.println(testBean.getDate());
	}
}
