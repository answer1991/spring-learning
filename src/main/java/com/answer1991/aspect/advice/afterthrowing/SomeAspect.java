package com.answer1991.aspect.advice.afterthrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SomeAspect {
	@Pointcut("execution(* doSomething(..))")
	private void somePointcut(){ }
	
	@AfterThrowing(pointcut = "somePointcut()", throwing = "exception")
	public void recovery(Throwable exception) {
		System.out.println(exception.getMessage());
	}
}
