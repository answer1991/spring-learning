package com.answer1991.aspect;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	private AbstractApplicationContext cxt;
	
	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("aspect.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		//NotUsefulAspect firstAspect = this.cxt.getBean("firstAspect", NotUsefulAspect.class);
		BeanWithTransform bean = this.cxt.getBean("testBean", BeanWithTransform.class);
		bean.transform();
	}
}
