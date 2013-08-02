package com.answer1991.method.injection;

public abstract class AbstractMethodInjectionBean {
	protected abstract MethodInjectedBean createBean();
	
	public void doSomethingByInjectedBean(){
		MethodInjectedBean innerBean = createBean();
		System.out.println(innerBean.getCount());
	}
}
