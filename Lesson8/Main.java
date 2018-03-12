package com.gmail.siniakboris;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Group groupOne = new Group();
		Group groupTwo = null;
		File fileOne = new File("groupOne.txt");
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Cостав группы:");

		groupOne.addGroup(groupOne);
		groupOne.sortStudent();
		groupOne.toPrintGroup();
		saveGroupToFile(groupOne, fileOne);
		loadGroupFromFile(groupTwo, fileOne);

		/*
		 * System.out.println(); System.out.println("Введите имя студента для поиска:");
		 * String name = sc.nextLine(); System.out.println("Найденный студент:");
		 * System.out.println(groupOne.searchStudent(name));
		 */

		/*
		 * groupOne.deleteStudent(1);
		 * groupOne.deleteStudent(2);
		 */

	}

	public static void saveGroupToFile(Group group, File file) {
		Scanner scSave = new Scanner(System.in);
		System.out.println();
		System.out.println("Нужно записать файл? Введите 1 для записи.");
		int sf = scSave.nextInt();

		if (sf == 1) {
			try {
				SerializableToFile.saveToFile(group, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void loadGroupFromFile(Group group, File file) {
		Scanner scLoad = new Scanner(System.in);
		System.out.println();
		System.out.println("Нужно считать записаный файл файл? Введите 1 для выполнения.");
		int sl = scLoad.nextInt();
		if (sl == 1 & file.exists()) {
			try {
				group = (Group) SerializableToFile.loadFromFile(file);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("Cостав сохранённой в файл группы:");
			group.toPrintGroup();
		} else {
			System.out.println("Файл не найден");
		}

	}

}
