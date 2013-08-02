package com.answer1991.spring.el;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestWithRootObject {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("spel.xml");
		this.cxt.registerShutdownHook();
	}
	
	@Test
	public void test1() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1856, 6, 5);
		
		Inventor inventor = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("name");
		EvaluationContext context = new StandardEvaluationContext(inventor);
		
		String name = expression.getValue(context, String.class);
		System.out.println(name);
	}
	
	@Test
	public void test2() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1856, 6, 5);
		
		Inventor inventor = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("name");
		
		String name = expression.getValue(inventor, String.class);
		System.out.println(name);
	}
	
	@Test
	public void test3() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1856, 6, 5);
		
		Inventor inventor = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("name == 'Nikola Tesla'");
		
		Boolean result = expression.getValue(inventor, Boolean.class);
		System.out.println(result);
	}
	
	@Test
	public void testSetValue() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1856, 6, 5);
		
		Inventor inventor = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

		ExpressionParser parser = this.cxt.getBean("parser", ExpressionParser.class);
		Expression expression = parser.parseExpression("date");
		
		expression.setValue(inventor, "1991-03-06");
		System.out.println(inventor.getDate());
	}
	
	@Test
	public void testSetValue2() {
		InnerListBoolean bean = new InnerListBoolean();
		bean.setList(new ArrayList<Boolean>());
		bean.getList().add(false);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("list[0]");
		
		expression.setValue(bean, "true");
		
		Assert.assertEquals(true, bean.getList().get(0));
	}
}
