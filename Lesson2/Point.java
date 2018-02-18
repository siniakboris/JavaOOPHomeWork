package com.gmail.siniakboris;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistance(Point a) {
		return Math.sqrt(Math.pow((a.x - x), 2) + Math.pow((a.y - y), 2));
	}

	@Override
	public String toString() {
		return "Точка [x=" + x + ", y=" + y + "]";
	}

}
