package com.answer1991.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MyDateFormatter implements Formatter<Date> {
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		return dateFormat.parse(text);
	}
	
	@Override
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	};
}
