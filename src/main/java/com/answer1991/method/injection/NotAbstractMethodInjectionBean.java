package com.answer1991.method.injection;

public class NotAbstractMethodInjectionBean {
	protected MethodInjectedBean createBean() {
		System.out.println("这个方法是没被覆盖的，如果出现这行字，说明测试失败!!");
		return new MethodInjectedBean();
	}
	
	public void doSomethingByInjectedBean() {
		MethodInjectedBean innerBean = createBean();
		System.out.println(innerBean.getCount());
	}
}
