package com.answer1991.callback;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

import com.answer1991.Hello;

public class LifecycleMethodOrderBean implements InitializingBean {
	public void initByXML() {
		System.out.println("initByXML method invoked!!");
	}
	
	@PostConstruct
	public void initByAnnotation() {
		System.out.println("initByAnnotation method invoked!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method invoked!!");
	}
	
	private Hello hello;

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		System.out.println("LifecycleMethodOrderBean setter method invoked!!");
		this.hello = hello;
	}
}
