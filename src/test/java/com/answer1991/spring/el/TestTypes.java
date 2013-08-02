package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestTypes {
	@Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();

		@SuppressWarnings("rawtypes")
		Class stringClass = parser.parseExpression("T(String)").getValue(
				Class.class);
		Assert.assertEquals(String.class, stringClass);
	}

	@Test
	public void test2() {
		ExpressionParser parser = new SpelExpressionParser();
		boolean trueValue = parser
				.parseExpression(
						"T(java.math.RoundingMode).CEILING < T(java.math.RoundingMode).FLOOR")
				.getValue(Boolean.class);
		
		Assert.assertTrue(trueValue);
	}
}
