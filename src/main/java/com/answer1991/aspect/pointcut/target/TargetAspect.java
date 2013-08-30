package com.answer1991.aspect.pointcut.target;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TargetAspect {
	@Pointcut("target(com.answer1991.aspect.LogicalInterface)")
	private void somePointCut() {}
	
	@Before("com.answer1991.aspect.pointcut.target.TargetAspect.somePointCut()")
	public void beforeDo() {
		System.out.println("beforeDo by somePointCut");
	}
}
