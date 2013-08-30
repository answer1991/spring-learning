package com.answer1991.aspect.advice.afterreturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterAspect {
	@Pointcut("execution(* getHello(..))")
	private void somePointcut() { }
	
	@AfterReturning(pointcut = "somePointcut()", returning = "retVal")
	public void doAfter(String retVal) {
		System.out.println("the return value is " + retVal + " , please do check!");
	}
}
