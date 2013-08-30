package com.answer1991.aspect.pointcut.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WithinAspect {
	/**
	 * 仅仅在aspect包下的，不包括它的子包
	 */
	@Pointcut("within(com.answer1991.aspect.*)")
	private void somePointCut(){
		
	}
	
	@Pointcut("within(com.answer1991.aspect..*)")
	private void somePointCut2() {
		
	}
	
	@Before("somePointCut() && args()")
	public void beforeDo() {
		System.out.println("advised by WithAspect somePointCut");
	}
	
	@Before("somePointCut2()")
	public void beforeDo2() {
		System.out.println("advised by WithAspect somePointCut2");
	}
}
