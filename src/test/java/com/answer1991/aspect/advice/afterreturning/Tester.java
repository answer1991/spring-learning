package com.answer1991.aspect.advice.afterreturning;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.answer1991.aspect.advice.afterreturning.TestBean;

public class Tester {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("aspect.after.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test1() {
		TestBean bean = this.cxt.getBean("testBean", TestBean.class);
		System.out.println(bean.getHello());
	}
}
