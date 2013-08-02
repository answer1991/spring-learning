package com.answer1991.spring.el;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestList {
	private Inventor inventor;
	
	@Before
	public void init() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1991, 3, 6);
		
		inventor = new Inventor();
		
		inventor.setName("Joe Chen");
		inventor.setCountry("China");
		inventor.setDate(calendar.getTime());

		inventor.setBirthdate(new Properties());
		inventor.setInventions(new ArrayList<String>());
		
		inventor.getBirthdate().setProperty("year", "1991");
		
		inventor.getInventions().add("invention 0");
		inventor.getInventions().add("invention 1");
		inventor.getInventions().add("invention 2");
	}
	
	@Test
	public void testProperty() {
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expr = expressionParser.parseExpression("Date.Year + 23");
		
		String year = expr.getValue(inventor, String.class);
		System.out.println(year);
	}
	
	@Test
	public void testProperties() {
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expr = expressionParser.parseExpression("Birthdate['year'] + 23");
		
		String year = expr.getValue(inventor, String.class);
		System.out.println(year);
	}
	
	@Test
	public void testList() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("Inventions[1]");
		
		String invention1 = expression.getValue(inventor, String.class);
		System.out.println(invention1);
		
	}
}
