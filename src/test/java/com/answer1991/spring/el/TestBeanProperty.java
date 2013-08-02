package com.answer1991.spring.el;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanProperty {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("spel.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		NumberGuess bean = this.cxt.getBean("numberGuess", NumberGuess.class);
		System.out.println(bean.getRandomNumber());
	}
	
	@Test
	public void test2() {
		NumberGuess bean1 = this.cxt.getBean("numberGuess", NumberGuess.class);
		NumberGuess bean2 = this.cxt.getBean("anotherNumberGuess", NumberGuess.class);
		Assert.assertEquals(bean1.getRandomNumber(), bean2.getRandomNumber());
	}
	
	@Test
	public void test3() {
		Properties properties = this.cxt.getBean("systemProperties", Properties.class);
		System.out.println(properties.getProperty("user.name"));
		
		FieldValueTestBean bean = this.cxt.getBean("fieldValueTestBean", FieldValueTestBean.class);
		System.out.println(bean.getHello());
	}
}
