package com.answer1991.merging;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerListBean {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testNoMerge(){
		InnerListBean bean = cxt.getBean("childInnerListBean", InnerListBean.class);
		List<Object> list = bean.getList();
		for(Object o : list) {
			System.out.println(o);
		}
		Assert.assertEquals(1, list.size());
	}
	
	@Test
	public void testMerge(){
		InnerListBean bean = cxt.getBean("childMergeInnerListBean", InnerListBean.class);
		List<Object> list = bean.getList();
		for(Object o : list) {
			System.out.println(o);
		}
		Assert.assertEquals(3, list.size());
	}
}
