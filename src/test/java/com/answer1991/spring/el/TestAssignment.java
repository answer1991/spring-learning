package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestAssignment {
	private NumberGuess guess;

	@Before
	public void init() {
		guess = new NumberGuess();
	}

	@Test
	public void testProperty() {
		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("RandomNumber");
		exp.setValue(this.guess, 1);

		Assert.assertEquals(1, this.guess.getRandomNumber());
	}

	@Test
	public void testGetter() {
		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("RandomNumber = 1");
		int number = exp.getValue(this.guess, Integer.class);
		
		Assert.assertEquals(1, number);
	}
}
