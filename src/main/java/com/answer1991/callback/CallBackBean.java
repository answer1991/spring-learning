package com.answer1991.callback;

import com.answer1991.Hello;

public class CallBackBean {
	private Hello hello;

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		System.out.println("CallBackBean setter method invoked!!");
		this.hello = hello;
	}
	
	
	public void init() {
		System.out.println("CallBackBean init method invoked!! it should be invoked after setter method!");
	}
	
	public void cleanup() {
		System.out.println("CallBackBean destroy method invoked!!");
	}
	
}
