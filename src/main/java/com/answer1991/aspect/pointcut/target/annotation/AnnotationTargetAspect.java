package com.answer1991.aspect.pointcut.target.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class AnnotationTargetAspect {
	/**
	 * \@target 只对被代理的类匹配，而不匹配它的父类或者接口
	 */
	@Pointcut("@within(com.answer1991.aspect.pointcut.target.annotation.HelloAnnotation)")
	private void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void beforeDoSomething() {
		System.out.println("hello");
	}
}
