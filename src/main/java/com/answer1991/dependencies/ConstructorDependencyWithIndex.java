package com.answer1991.dependencies;

public class ConstructorDependencyWithIndex {
	private String firstName;
	private String lastName;
	
	/**
	 * Construcotr
	 * @param firstName
	 * @param lastName
	 */
	public ConstructorDependencyWithIndex(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void sayName(){
		System.out.println("my name is " + this.firstName + " " + this.lastName);
	}
}
