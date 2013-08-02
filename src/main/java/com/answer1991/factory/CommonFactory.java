package com.answer1991.factory;

public class CommonFactory {
	/**
	 * InnerClass for test
	 * @author zet
	 *
	 */
	public static class InnerClassOfCommonFactory{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	public InnerClassOfCommonFactory createInstance(){
		return new InnerClassOfCommonFactory();
	}
}
