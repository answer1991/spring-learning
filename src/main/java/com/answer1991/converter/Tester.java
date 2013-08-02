package com.answer1991.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class Tester {
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.setName("Joe");
		
		ConverterFactory<Bar, Foo> factory = new BarToFooConverterFactory();
		
		Converter<Bar, Foo> fooConverter = factory.getConverter(Foo.class);
		Foo foo = fooConverter.convert(bar);
		System.out.println(foo.getName());
		
		Converter<Bar, FooChild> fooChildConverter = factory.getConverter(FooChild.class);
		FooChild fooChild = fooChildConverter.convert(bar);
		System.out.println(fooChild.getName());
	}
}
