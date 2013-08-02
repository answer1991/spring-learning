package com.answer1991.method.injection;

public class MethodInjectedBean {
	public static int i = 0;
	
	public MethodInjectedBean() {
		i ++;
	}
	
	public int getCount(){
		return i;
	}
}
