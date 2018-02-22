package com.gmail.siniakboris;

public class Student extends Human {
	
	private int number;

	public Student(String name, int age, String sex, int number) {
		super(name, age, sex);
		this.number = number;
	}
	

	public Student(String name, int age, String sex) {
		super(name, age, sex);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Номер зачётки = " + number + super.toString();
	}
	
}
