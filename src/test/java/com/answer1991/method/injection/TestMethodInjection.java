package com.answer1991.method.injection;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjection {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testAbstract() {
		AbstractMethodInjectionBean bean1 = cxt.getBean("abstractMethodInjectionBean", AbstractMethodInjectionBean.class);
		bean1.doSomethingByInjectedBean();
		
		AbstractMethodInjectionBean bean2 = cxt.getBean("abstractMethodInjectionBean", AbstractMethodInjectionBean.class);
		bean2.doSomethingByInjectedBean();
	}
	
	@Test
	public void testNotAbstract() {
		NotAbstractMethodInjectionBean bean = cxt.getBean("notAbstractMethodInjectionBean", NotAbstractMethodInjectionBean.class);
		bean.doSomethingByInjectedBean();
		
		NotAbstractMethodInjectionBean bean2 = cxt.getBean("notAbstractMethodInjectionBean", NotAbstractMethodInjectionBean.class);
		bean2.doSomethingByInjectedBean();
	}
}
