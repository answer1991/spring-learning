package com.answer1991.spring.el;

public class NumberGuess {
	private int randomNumber;

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	public Boolean isEqual(int number) {
		return this.randomNumber == number;
	}
}
