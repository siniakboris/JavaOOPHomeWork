package com.gmail.siniakboris;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List <Integer> listOne = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
            listOne.add(i);
        }

		System.out.println(listOne);
		
		listOne.remove(0);
		listOne.remove(0);
		listOne.remove(listOne.size() - 1);
		
		System.out.println(listOne);
	}

}
