package com.answer1991.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class RequiredTestBean {
	//不设置这个属性Container初始化的时候会报错！
	private AutoWireProperty autoWireProperty;

	public AutoWireProperty getAutoWireProperty() {
		return autoWireProperty;
	}
	
	/**
	 * Required 和 Autowired 注解要同时使用在setter上面
	 * @param autoWireProperty
	 */
	@Required
	@Autowired
	public void setAutoWireProperty(AutoWireProperty autoWireProperty) {
		this.autoWireProperty = autoWireProperty;
	}
}
