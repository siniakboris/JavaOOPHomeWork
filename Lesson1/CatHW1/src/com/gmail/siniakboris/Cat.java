package com.gmail.siniakboris;

public class Cat {
	private String name;
	private String color;
	private String type;
	private double weight;
	private int age;

	public Cat(String name, String color, String type, double weight, int age) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayMeah() {
		System.out.println("Мяу-мяу");
	}

	public void sayMur() {
		System.out.println("Мур-мур");
	}

	public double catEat() {
		this.weight = weight + 0.5;
		return weight;
	}

	@Override
	public String toString() {
		return "Cat [Имя=" + name + ", Цвет=" + color + ", Порода=" + type + ", Вес=" + weight + ", Возраст=" + age
				+ "]";
	}

}
