package com.answer1991.bean.factory.processor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("bean.factory.processor.xml");
		cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		DataSource ds = cxt.getBean("dataSource", DataSource.class);
		Assert.assertEquals("admin", ds.getUsername());
		Assert.assertEquals("123456", ds.getPassword());
		Assert.assertEquals("mysql:jdbc://127.0.0.1:3306/hello", ds.getUrl());
	}
	
	@Test
	public void testProperty() {
		TestBean bean = cxt.getBean("testBean", TestBean.class);
		Assert.assertEquals(PropertyOne.class, bean.getProperty().getClass());
	}
	
}
