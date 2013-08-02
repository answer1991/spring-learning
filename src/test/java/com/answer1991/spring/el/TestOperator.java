package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestOperator {
	@Test
	public void test1() {
		ExpressionParser parser = new SpelExpressionParser();
		
		boolean value1 = parser.parseExpression("2 == 2").getValue(Boolean.class);
		Assert.assertEquals(true, value1);
		
		boolean value2 = parser.parseExpression("2 < -2").getValue(Boolean.class);
		Assert.assertEquals(false, value2);
		
		boolean value3 = parser.parseExpression("'block' > 'black'").getValue(Boolean.class);
		Assert.assertEquals(true, value3);
	}
	
	@Test
	public void test2() {
		ExpressionParser parser = new SpelExpressionParser();
		
		boolean value1 = parser.parseExpression("'xyz' instanceof T(java.lang.String)").getValue(Boolean.class);
		Assert.assertEquals(true, value1);
		
		boolean value2 = parser.parseExpression("2 instanceof T(java.lang.Integer)").getValue(Boolean.class);
		Assert.assertEquals(true, value2);
		
		boolean value3 = parser.parseExpression("2 instanceof T(int)").getValue(Boolean.class);
		Assert.assertEquals(false, value3);
	}
	
	@Test
	public void test3() {
		ExpressionParser parser = new SpelExpressionParser();
		
		boolean value1 = parser.parseExpression("'4.00' matches '^\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
		Assert.assertEquals(true, value1);
		
		boolean value2 = parser.parseExpression("'4.0013' matches '^\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
		Assert.assertEquals(false, value2);
	}
	
	@Test
	public void test4() {
		//lt ('<'), gt ('>'), le ('<='), ge('>='), eq ('=='), ne ('!='), div ('/'), mod ('%'), not ('!').
		ExpressionParser parser = new SpelExpressionParser();
		
		Boolean value1 = parser.parseExpression("1 gt 0").getValue(Boolean.class);
		Assert.assertEquals(true, value1);
		
	}
}
