package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMethod {
	@Test
	public void testStringMethod() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'abc'.substring(1, 3)");
		String value = exp.getValue(String.class);
		
		Assert.assertEquals("bc", value);
		System.out.println("value ---> " + value);
	}
	
	@Test
	public void testWithContext() {
		NumberGuess guess = new NumberGuess();
		guess.setRandomNumber(3);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("isEqual(3)");
		
		Boolean result = exp.getValue(guess, Boolean.class);
		
		Assert.assertEquals(true, result);
	}
}
