package com.answer1991.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotUsefulAspect {
	
	@Pointcut("excution(* transform(..))")
	public void someOldTransform() {
		System.out.println("hello");
	}
}
