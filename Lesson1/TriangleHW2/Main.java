package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {

		Triangle triangleOne = new Triangle(2.5, 2.5, 2.5);
		System.out.println("Треугольник № 1");
		System.out.println(triangleOne.toString());
		if (triangleOne.rightTriangle()) {
			System.out.println("Площать треугольника = " + triangleOne.formulaHerons());
		} else {
			System.out.println("Ошибка, такой треугольник не может существовать");
		}

		System.out.println();
		System.out.println("Треугольник № 2");
		Triangle triangleTwo = new Triangle(3, 4, 5);
		System.out.println(triangleTwo.toString());
		if (triangleTwo.rightTriangle()) {
			System.out.println("Площать треугольника = " + triangleTwo.formulaHerons());
		} else {
			System.out.println("Ошибка, такой треугольник не может существовать");
		}

		System.out.println();
		System.out.println("Треугольник № 3");
		Triangle triangleThree = new Triangle(1, 1, 9);
		System.out.println(triangleThree.toString());
		if (triangleThree.rightTriangle()) {
			System.out.println("Площать треугольника = " + triangleThree.formulaHerons());
		} else {
			System.out.println("Ошибка, такой треугольник не может существовать");
		}

	}

}
