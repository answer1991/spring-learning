package com.answer1991.property.editor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFooTypeEditor {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("property.editor.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test() {
		Bar bar = this.cxt.getBean("bar", Bar.class);
		Assert.assertEquals("I'm Joe Chen", bar.getFoo().getHello());
	}
	
	@Test
	public void testBuiltInProeprtyEditor() {
		BuiltInPropertyTestBean bean = this.cxt.getBean("builtInPropertyTestBean", BuiltInPropertyTestBean.class);
		System.out.println(bean.getBirth());
	}
}
