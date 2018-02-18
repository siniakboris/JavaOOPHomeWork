package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {

		Point pointOne = new Point(4, 2);
		Point pointTwo = new Point(8, 4);
		Point pointThree = new Point(10, 4);
		Point pointFour = new Point(12, 2);
		
		System.out.println();

		Square squareOne = new Square(pointOne, pointTwo);
		System.out.println("Квадрат:");
		System.out.println("Сторона квадрата = " + squareOne.getSide());
		System.out.println("Периметр квадрата = " + squareOne.getPerimetr());
		System.out.println("Площадь квадрата = " + squareOne.getArea());

		System.out.println();
		
		Circle circleOne = new Circle(pointOne, pointTwo);
		System.out.println("Круг:");
		System.out.println("Периметр круга = " + circleOne.getPerimetr());
		System.out.println("Площадь Круга = " + circleOne.getArea());
		
		System.out.println();
		
		Rectangle rectangleOne = new Rectangle(pointOne, pointTwo, pointThree, pointFour);
		System.out.println("Прямоугольник:");
		System.out.println("Периметр прямоугольника = " + rectangleOne.getPerimetr());
		System.out.println("Площадь прямоугольника = " + rectangleOne.getArea());
	}

}
