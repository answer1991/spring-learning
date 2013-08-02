package com.answer1991.dependencies.idref;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIdRefBean {
	private ApplicationContext cxt;
	
	@Before
	public void init(){
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testError(){
		//使用idRef再没有生成bean之前会检查错误
		cxt.containsBean("hello");
	}
}
