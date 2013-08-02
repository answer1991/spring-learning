package com.answer1991.property.editor;

import java.beans.PropertyEditorSupport;

public class FooTypeEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Foo temp = new Foo();
		temp.setHello(text);
		super.setValue(temp);
	}
}
