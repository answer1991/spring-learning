package com.answer1991.factory;

public class StaticFactory {
	public static class InnerClassOfStaticFactory {
		private String name;
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	}
	
	public static InnerClassOfStaticFactory createInstance(){
		return new InnerClassOfStaticFactory();
	}
}
