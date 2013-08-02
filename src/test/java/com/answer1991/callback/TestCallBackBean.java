package com.answer1991.callback;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCallBackBean {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		CallBackBean callBackBean = cxt.getBean("callBackBean", CallBackBean.class);
		callBackBean.getHello();
	}
}
