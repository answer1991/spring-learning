package com.answer1991.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConvert {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("convert.xml");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		TestBean testBean = this.cxt.getBean("testBean", TestBean.class);
		Assert.assertEquals("Joe Chen", testBean.getFoo().getName());
	}
}
