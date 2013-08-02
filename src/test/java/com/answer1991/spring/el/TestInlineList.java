package com.answer1991.spring.el;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestInlineList {
	@SuppressWarnings("unchecked")
	@Test
	public void test1() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("{'String1', 'String2', 'String3'}");
		
		//list是一个常量，会对它进行缓存
		//是一个UnmodifiableCollection
		List<String> list = expression.getValue(List.class);
		
		List<String> list2 = expression.getValue(List.class);
		Assert.assertTrue(list == list2);
	}
}
