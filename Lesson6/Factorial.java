package com.gmail.siniakboris;

import java.math.BigInteger;

public class Factorial implements Runnable {
	
	private int number;
	
	public Factorial(int number) {
		super();
		this.number = number;
	}

	public BigInteger caclucateFactorial (int number) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i < this.number; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		} 
		return fact;
	}
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= number; i++) {
			System.out.println(th.getName() + " " + caclucateFactorial(number));
		}	
	}	
}
