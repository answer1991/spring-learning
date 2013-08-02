package com.answer1991.merging;

import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerMapBean {
	private ApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void test(){
		InnerMapBean bean = cxt.getBean("childInnerMapBean", InnerMapBean.class);
		Map<String, Object> map = bean.getMap();
		for(Iterator<String> keys = map.keySet().iterator(); keys.hasNext();) {
			String key = keys.next();
			System.out.println(map.get(key));
		}
	}
}
