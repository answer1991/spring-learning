package com.answer1991.aspect.advice.before;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SomeAspect {
	
	@Pointcut("target(com.answer1991.aspect.LogicalBean)")
	private void somePointcut(){ };
	
	@Before("com.answer1991.aspect.advice.before.SomeAspect.somePointcut()")
	public void beforeDoSomething(){
		System.out.println("before do something");
	}
	
	@Before("execution(int com.answer1991.aspect.LogicalBean.doSomething())")
	public void beforeDoSomething2() {
		System.out.println("before do something by 2");
	}
	
	@AfterReturning("somePointcut()")
	public void afterDoSomething() {
		System.out.println("after returning..");
	}
}
