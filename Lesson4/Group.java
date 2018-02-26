package com.gmail.siniakboris;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {

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
		
		Student st = new Student ("имя", 0, "пол", 0);
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

	public void sortStudent () {
		Arrays.sort(group, (a, b) -> NullCheck.checkNull(a, b) == NullCheck.NOT_NULL ? a.getName().compareTo(b.getName()) 
				: NullCheck.checkNull(a, b));
	}

	@Override
	public Student[] voenkomSort() {
		int numberRecruts = 0;
		
		for (int j = 0; j < group.length; j++) {
			if (group[j] != null && group[j].getAge() >= 18 && group[j].getSex().equals("мужской")) {
				numberRecruts = numberRecruts + 1;
			}
		}
		
			Student[] recruts = new Student[numberRecruts];
			int number = 0;
			for (int i = 0; i < group.length; i++) {
				if (group[i] != null && group[i].getAge() >= 18 && group[i].getSex().equals("мужской")) {
					recruts[number] = group[i];
					number = number + 1;
				}
			}
		return recruts;
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

}
