package com.gmail.siniakboris;

public class Triangle {

private double a;
private double b;
private double c;

public Triangle(double a, double b, double c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}
	
public Triangle() {
	super();
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

public double getC() {
	return c;
}

public void setC(double c) {
	this.c = c;
}

@Override
public String toString() {
	return "Cтороны треугольника: a = " + a + ", b = " + b + ", c = " + c + "";
}

public double formulaHerons () {
	double p = (a + b + c) / 2;
	double s = Math.sqrt(p * (p - a) * (p - b) *(p -c));
	return s;
}

public boolean rightTriangle () {
	boolean triangle = false;
	if ((a + b > c) && (a + c > b) && (b + c > a)){
		triangle = true;
	}
	return triangle;
}
	
}
