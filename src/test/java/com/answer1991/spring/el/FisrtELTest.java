package com.answer1991.spring.el;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class FisrtELTest {
	@Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression =  parser.parseExpression("'hello world'");
		String value = (String) expression.getValue();
		System.out.println(value);
	}
	
	@Test
	public void testWithMethod() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression =  parser.parseExpression("'hello world'.concat('!')");
		String value = (String) expression.getValue();
		System.out.println(value);
		
		Expression bytesExpression = parser.parseExpression("'hello world'.bytes");
		byte[] bytes = (byte[]) bytesExpression.getValue();
		System.out.println(bytes);
		
		Expression bytesLengthExpression = parser.parseExpression("'hello world'.bytes.length");
		int length = bytesLengthExpression.getValue(Integer.class);
		System.out.println(length);
	}
	
	@Test
	public void testWithConstructor() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("new String('hello world').toUpperCase()");
		String message = expression.getValue(String.class);
		System.out.println(message);
	}
	
	
}
