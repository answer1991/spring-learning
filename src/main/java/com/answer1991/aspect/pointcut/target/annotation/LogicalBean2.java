package com.answer1991.aspect.pointcut.target.annotation;

import com.answer1991.aspect.LogicalInterface;


public class LogicalBean2 implements LogicalInterface {
	@Override
	@HelloAnnotation
	public void doSomething() {
		System.out.println("doSomething by LogicalBean2");
	}
}
