package com.answer1991.dependencies;

public class StaticFactoryDependency {
	private Bar bar;
	private Baz baz;
	
	private StaticFactoryDependency(Bar bar, Baz baz){
		this.bar = bar;
		this.baz = baz;
	}
	
	public static StaticFactoryDependency getInstance(Bar bar, Baz baz){
		return new StaticFactoryDependency(bar, baz);
	}

	public Bar getBar() {
		return bar;
	}

	public Baz getBaz() {
		return baz;
	}
}
