package com.answer1991.lazy.initialized;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLazyInitialized {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test() {
		
	}
	
	//lazy bean只有在请求的情况下才会被初始化
	@Test
	public void testGetBean() {
		LazyInitializedBean bean = cxt.getBean("lazyInitializedBean", LazyInitializedBean.class);
		System.out.println(bean.toString());
	}
}
