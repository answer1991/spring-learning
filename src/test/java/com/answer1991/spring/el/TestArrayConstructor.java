package com.answer1991.spring.el;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestArrayConstructor {
	@Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("new int[3]");
		
		int[] array = expression.getValue(int[].class);
		
		for(int i : array) {
			System.out.println(i);
		}
	}
}
