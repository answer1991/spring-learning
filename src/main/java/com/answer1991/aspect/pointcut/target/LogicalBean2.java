package com.answer1991.aspect.pointcut.target;

import com.answer1991.aspect.LogicalInterface;

public class LogicalBean2 implements LogicalInterface {

	@Override
	public void doSomething() {
		System.out.println("logicalBean2 do something");
	}

}
