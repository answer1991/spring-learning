package com.answer1991.format;

import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

public final class NumberFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<org.springframework.format.annotation.NumberFormat> {

	@Override
	public Set<Class<?>> getFieldTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Printer<?> getPrinter(org.springframework.format.annotation.NumberFormat annotation, Class<?> fieldType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parser<?> getParser(org.springframework.format.annotation.NumberFormat annotation, Class<?> fieldType) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
