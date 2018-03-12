package com.gmail.siniakboris;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Serializable {

	private Student[] group = new Student[10];

	public Group(Student[] group) {
		super();
		this.group = group;

	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public void addStudentManual() throws MyException {

		Student st = new Student("имя", 0, "пол", 0);
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите имя:");
		st.setName(sc.nextLine());
		System.out.println("Введите возраст:");
		st.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Введите пол:");
		st.setSex(sc.nextLine());
		System.out.println("Введите номер зачетки:");
		st.setNumber(sc.nextInt());

		if (st.getAge() < 0 || st.getNumber() < 0 || st.getName() == null) {
			System.out.println("Ошибка ввода данных. Студент не добавлен");
			st = null;
		}

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = st;
				return;
			}
		}
		throw new MyException();
	}

	public void sortStudent() {
		Arrays.sort(group,
				(a, b) -> NullCheck.checkNull(a, b) == NullCheck.NOT_NULL ? a.getName().compareTo(b.getName())
						: NullCheck.checkNull(a, b));
	}

	public void addStudent(Student st) throws MyException {
		if (st == null) {
			throw new IllegalArgumentException("Студент не найден");
		}
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = st;
				return;

			}
		}
		throw new MyException();
	}

	public void deleteStudent(int a) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getNumber() == a) {
				group[i] = null;
				break;
			}

		}

	}

	public Student searchStudent(String name) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getName().equals(name)) {
				return group[i];
			}
		}
		return null;

	}

	public void toPrintGroup() {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				System.out.println("Номер зачетки: " + group[i].getNumber() + ", имя студента: " + group[i].getName()
						+ ", возраст: " + group[i].getAge() + ", пол: " + group[i].getSex());
			}
		}

	}

	public Group addGroup(Group group) {

		Student Ivan = new Student("Иван", 19, "мужской", 1);
		Student Lena = new Student("Лена", 20, "женский", 2);
		Student Anna = new Student("Аня", 18, "женский", 2);
		Student Bogdan = new Student("Богдан", 19, "мужской", 2);
		Student Victor = new Student("Виктор", 25, "мужской", 2);

		try {
			// groupOne.addStudentManual();
			group.addStudent(Ivan);
			group.addStudent(Lena);
			group.addStudent(Anna);
			group.addStudent(Bogdan);
			group.addStudent(Victor);

		} catch (MyException e) {
			System.out.println(e.toString());
		}

		return group;
	}

}
