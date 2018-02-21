package com.gmail.siniakboris;

public class Group {

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

	public int numberOfStudents() {
		int number = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				number = number + 1;
			}
		}
		return number;
	}

	public void addStudent(Student st) throws MyException {
		
		if (st == null) {
			throw new IllegalArgumentException("Null student");
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
		for (int j = 0; j < group.length; j++) {
			if (group[j] != null && group[j].getNumber() == a) {
				group[j] = null;
				break;
			}

		}

	}

	public Student searchStudent(String name) {
		for (int k = 0; k < group.length; k++) {
			if (group[k] != null && group[k].getName().equals(name)) {
				return group[k];
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
