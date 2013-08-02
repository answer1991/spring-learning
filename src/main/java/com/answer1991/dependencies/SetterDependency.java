package com.answer1991.dependencies;

public class SetterDependency {
	private Bar bar;
	private Baz baz;
	
	public void say(){
		bar.sayHello();
		baz.sayWelcome();
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Baz getBaz() {
		return baz;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}
}
