package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {
		Student Ivan = new Student ("Иван", 19, "мужской", 1);
		Student Lena = new Student ("Лена", 20, "женский", 2);
		Student Katya = new Student ("Катя", 18, "женский", 3);
		Student Denis = new Student ("Денис", 21, "мужской", 4);
		
		Group groupOne = new Group();
	
		System.out.println(Ivan.toString());
		System.out.println(Lena.toString());
		System.out.println(Katya.toString());
		System.out.println(Denis.toString());
		
		System.out.println();
		System.out.println("Cостав группы:");
		
		try {
		groupOne.addStudent(Ivan);
		groupOne.addStudent(Lena);
		System.out.println(groupOne.toString());
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		groupOne.deleteStudent(1);
		System.out.println(groupOne.toString());
		
		System.out.println(groupOne.searchStudent("Лена"));
		

	}

}
