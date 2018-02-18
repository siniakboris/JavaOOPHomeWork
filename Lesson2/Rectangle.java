package com.gmail.siniakboris;

public class Rectangle extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}
	
	@Override
	public double getPerimetr() {
		return a.getDistance(b) + a.getDistance(c) + c.getDistance(d) + b.getDistance(d);
	}
	@Override
	public double getArea() {
		double p = (a.getDistance(b) + a.getDistance(c) + c.getDistance(d) + b.getDistance(d)) / 2;
		double s = Math.sqrt((p - a.getDistance(b)) * (p - a.getDistance(c)) * (p - c.getDistance(d)) * ( p -  b.getDistance(d)));
		return s;
	}

	@Override
	public String toString() {
		return "Прямоугольник [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
