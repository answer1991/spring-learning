package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestLogical {
	@Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();
		
		Boolean value1 = parser.parseExpression("true and false").getValue(Boolean.class);
		Assert.assertEquals(false, value1);
	}
	
	@Test
	public void test2() {
		ExpressionParser parser = new SpelExpressionParser();
		
		NumberGuess guess = new NumberGuess();
		guess.setRandomNumber(3);
		
		Boolean value1 = parser.parseExpression("isEqual(3) or isEqual(2)").getValue(guess, Boolean.class);
		Assert.assertEquals(true, value1);
		
		Boolean value2 = parser.parseExpression("isEqual(3) and isEqual(2)").getValue(guess, Boolean.class);
		Assert.assertEquals(false, value2);
		
		Boolean value3 = parser.parseExpression("!isEqual(4)").getValue(guess, Boolean.class);
		Assert.assertTrue(value3);
	}
}
