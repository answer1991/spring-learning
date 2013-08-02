package com.answer1991.autowiring.rule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAutowiring {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("autowiring.rule.xml");
		cxt.registerShutdownHook();
	}

	@Test
	public void test() {
		TestBean bean = cxt.getBean("testBean", TestBean.class);
		System.out.println(bean.getProperty());
	}

	@Test
	public void testSetProperty() {
		SetPropertyTestBean bean = cxt.getBean("setPropertyTestBean", SetPropertyTestBean.class);
		Assert.assertEquals(2, bean.getProperties().size());
	}
	

	@Test
	public void testMehtodAutowired() {
		MethodAutowiredBean bean = cxt.getBean("methodAutowiredBean", MethodAutowiredBean.class);
		Assert.assertEquals(PropertyOne.class, bean.getProperty().getClass());
	}
	
	@Test
	public void testOtherMethodAutored() {
		OtherMethodAutowiredBean bean = cxt.getBean("otherMethodAutowiredBean", OtherMethodAutowiredBean.class);
		Assert.assertEquals(PropertyOne.class, bean.getPropertyOne().getClass());
		Assert.assertEquals(PropertyOne.class, bean.getPropertyTwo().getClass());
	}
	
	@Test
	public void testSelfDefineAnnotation() {
		SelfDefineAnnotationTestBean bean = cxt.getBean("selfDefineAnnotationTestBean", SelfDefineAnnotationTestBean.class);
		Assert.assertEquals(PropertyTwo.class, bean.getProperty().getClass());
	}
}
