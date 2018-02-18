package com.gmail.siniakboris;

public class Square extends Shape {

	private Point a;
	private Point b;

	public Square(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
	
	public double getArea() {
		return Math.pow(a.getDistance(b), 2) / 2;
	}

	public double getSide() {

		return Math.sqrt(getArea());
	}

	public double getPerimetr() {
		return getSide() * 4;
	}

	@Override
	public String toString() {
		return "Квадрат [a=" + a + ", b=" + b + "]";
	}

}
