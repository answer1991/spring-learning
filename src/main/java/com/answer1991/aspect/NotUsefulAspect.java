package com.answer1991.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotUsefulAspect {
	
	@Pointcut("execution(* transform*(..))")
	public void someOldTransform() {};
	
	@Before(value = "someOldTransform()")
	public void beforeSomeOldTransform() {
		System.out.println("hello");
	}
}
