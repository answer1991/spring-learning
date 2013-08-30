package com.answer1991.aspect;

import com.answer1991.aspect.pointcut.target.annotation.HelloAnnotation;

@HelloAnnotation
public interface LogicalInterface {
	public abstract void doSomething();
}
