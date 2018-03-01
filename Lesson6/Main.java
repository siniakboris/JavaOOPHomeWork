package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {
		
		Thread[] array = new Thread[100];
	
		for (int i = 1; i <= array.length; i ++) {
			array[i] = new Thread(new Factorial(i));
			array[i].start();
		}
	
}
}
