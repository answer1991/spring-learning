package com.answer1991.aspect.advice.afterthrowing;

public class TestBean {
	public void doSomething() {
		throw new SomeException("hello");
	}
}
