package com.answer1991.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMathematical {
	@Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();
		
		Integer value1 = parser.parseExpression("3 / 2").getValue(Integer.class);
		Assert.assertEquals(new Integer(1), value1);
		
		Double value2 = parser.parseExpression("3.0 / 2").getValue(Double.class);
		Assert.assertEquals(1.5, value2, 0.1);
	}
}
