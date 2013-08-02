package com.answer1991.converter;

import org.springframework.core.convert.converter.Converter;

public class BarToFooConverter implements Converter<Bar, Foo> {
	@Override
	public Foo convert(Bar source) {
		Foo foo = new Foo();
		foo.setName(source.getName());
		
		return foo;
	}
}
