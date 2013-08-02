package com.answer1991.dependon;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependon {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test() {
		cxt.getBean("firstInitBean");
	}
}
