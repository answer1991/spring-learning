package com.answer1991.dependencies;

public class FooConstructorDependency {
	private Bar bar;
	private Baz baz;
	
	public FooConstructorDependency(Bar bar, Baz baz){
		this.bar = bar;
		this.baz = baz;
	}
	
	public void say(){
		this.bar.sayHello();
		this.baz.sayWelcome();
	}
}
