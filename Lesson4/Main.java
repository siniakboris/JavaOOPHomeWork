package com.gmail.siniakboris;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Student Ivan = new Student ("Иван", 19, "мужской", 1);
		Student Lena = new Student ("Лена", 20, "женский", 2);
		Student Anna = new Student ("Аня", 18, "женский", 2);
		Student Bogdan = new Student ("Богдан", 19, "мужской", 2);
		Student Victor = new Student ("Виктор", 25, "мужской", 2);
		
		Group groupOne = new Group();
			
		System.out.println();
		System.out.println("Cостав группы:");

		try {
		
		groupOne.addStudentManual();
		groupOne.addStudent(Ivan);
		groupOne.addStudent(Lena);
		groupOne.addStudent(Anna);
		groupOne.addStudent(Bogdan);
		groupOne.addStudent(Victor);

		} catch (MyException e) {
			System.out.println(e.toString());
		}
		
		groupOne.sortStudent();
		groupOne.toPrintGroup();
		
		System.out.println();
		System.out.println("Найденные студенты");
		System.out.println(groupOne.searchStudent("Иван"));
		
		System.out.println();
		System.out.println("Поставить на учет в военкомат:");
		
		System.out.println(Arrays.toString(groupOne.voenkomSort()));
		
		groupOne.deleteStudent(1);
		groupOne.deleteStudent(2);
		
	}

}
