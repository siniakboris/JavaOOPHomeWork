package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat();
		catOne.setName("Фродо");
		catOne.setColor("Коричневый");
		catOne.setType("Бурмилла");
		catOne.setWeight(3.5);
		catOne.setAge(3);

		catOne.sayMeah();
		System.out.println(catOne);

		Cat catTwo = new Cat();
		catTwo.setName("Гендальф");
		catTwo.setColor("Белый");
		catTwo.setType("Рэгдолл");
		catTwo.setWeight(4.4);
		catTwo.setAge(8);

		catTwo.sayMur();
		catTwo.catEat();
		System.out.println(catTwo);

	}

}
