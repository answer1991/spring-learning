package com.answer1991.property.editor;

import java.io.File;
import java.util.Date;

public class BuiltInPropertyTestBean {
	private Date birth;
	private File log;
	
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public File getLog() {
		return log;
	}
	public void setLog(File log) {
		this.log = log;
	}
}
