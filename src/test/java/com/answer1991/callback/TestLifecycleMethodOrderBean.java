package com.answer1991.callback;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycleMethodOrderBean {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void test() {
		LifecycleMethodOrderBean bean = cxt.getBean("lifecycleMethodOrderBean", LifecycleMethodOrderBean.class);
		bean.getHello();
	}
}
