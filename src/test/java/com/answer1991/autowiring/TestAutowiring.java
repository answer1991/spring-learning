package com.answer1991.autowiring;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	private AbstractApplicationContext cxt;
	private static Logger logger = Logger.getLogger(TestAutowiring.class);

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("autowiring.xml");
		logger.error("hello");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test(){
		AutoWireBean bean = cxt.getBean("autoWireBean", AutoWireBean.class);
		Assert.assertNotNull(bean.getAutoWireProperty());
	}
	
}
