package com.answer1991.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class BarToFooConverterFactory implements ConverterFactory<Bar, Foo> {
	@Override
	public <T extends Foo> Converter<Bar, T> getConverter(Class<T> targetType) {
		return new BarToFooConverter<T>(targetType);
	}

	private final class BarToFooConverter<T extends Foo> implements
			Converter<Bar, T> {
		private Class<T> clz;

		public BarToFooConverter(Class<T> target) {
			clz = target;
		}

		@Override
		public T convert(Bar source) {
			T foo = null;
			try {
				foo = clz.newInstance();
				foo.setName(source.getName());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return foo;
		}
	}
}
