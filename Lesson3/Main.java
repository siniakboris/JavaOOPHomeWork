package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {
		Student Ivan = new Student ("Иван", 19, "мужской", 1);
		Student Lena = new Student ("Лена", 20, "женский", 2);
		Student Katya = new Student ("Катя", 18, "женский", 3);
		Student Denis = new Student ("Денис", 21, "мужской", 4);
		Student Boris = new Student ("Борис", 21, "мужской", 5);
		Student Sveta = new Student ("Света", 20, "женский", 6);
		Student Dasha = new Student ("Даша", 19, "женский", 7);
		Student Victor = new Student ("Витя", 20, "мужской", 8);
		Student Sergei = new Student ("Сергей", 19, "мужской", 9);
		Student Nastya = new Student ("Настя", 21, "женский", 10);
		Student Misha = new Student ("Миша", 20, "мужской", 11);
		Student Alla = new Student ("Алла", 19, "женский", 12);
		
		Group groupOne = new Group();
			
		System.out.println();
		System.out.println("Cостав группы:");

		
		try {
		groupOne.addStudent(Ivan);
		groupOne.addStudent(Lena);
		groupOne.addStudent(Katya);
		groupOne.addStudent(Denis);
		groupOne.addStudent(Boris);
		groupOne.addStudent(Sveta);
		groupOne.addStudent(Dasha);
		groupOne.addStudent(Victor);
		groupOne.addStudent(Sergei);
		groupOne.addStudent(Nastya);
		groupOne.addStudent(Misha);
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		System.out.println("Количество студентов в группе: " + groupOne.numberOfStudents());
		
		groupOne.toPrintGroup();
		
		System.out.println();
		System.out.println("Найденные студенты:");
		System.out.println(groupOne.searchStudent("Витя"));
		System.out.println(groupOne.searchStudent("Денис"));
		
		groupOne.deleteStudent(1);
		groupOne.deleteStudent(2);
	
	}
}
