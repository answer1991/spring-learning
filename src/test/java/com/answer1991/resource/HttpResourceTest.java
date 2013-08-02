package com.answer1991.resource;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class HttpResourceTest {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("autowiring.xml");
	}

	@Test
	public void test() {
		Resource resource = this.cxt.getResource("http://www.qq.com");
		//Resource fileResource = this.cxt.getResource("c:/qq.html");
		
		System.out.println(resource.isOpen());
		System.out.println(resource.getClass());
		
		InputStream is = null;
		try {
			is = resource.getInputStream();

			StringBuffer sb = new StringBuffer();
			byte[] buffer = new byte[400];
			int i = is.read(buffer, 0, 400);

			while (i >= 0) {
				sb.append(new String(buffer));
				i = is.read(buffer, 0, 400);
			}

			System.out.println(sb.toString());
			System.out.println(resource.isOpen());
		} catch (IOException e) {
			Assert.assertTrue(false);
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
