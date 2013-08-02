package com.answer1991.autowiring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRequired {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("autowiring.xml");
		cxt.registerShutdownHook();
	}

	@Test
	public void test() {
		RequiredTestBean bean = cxt.getBean("requiredTestBean",
				RequiredTestBean.class);
		System.out.println(bean.getAutoWireProperty());
	}

}
