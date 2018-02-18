package com.gmail.siniakboris;

public class Circle extends Shape {
	
	private Point center;
	private Point point;
	
	public Circle(Point center, Point point) {
		super();
		this.center = center;
		this.point = point;
	}

	public Circle() {
		super();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public double getPerimetr() {
		return 2 * Math.PI * center.getDistance(point);
	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(center.getDistance(point), 2);
	}
	
	@Override
	public String toString() {
		return "Круг [center=" + center + ", point=" + point + "]";
	}
		
}
