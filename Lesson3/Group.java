package com.gmail.siniakboris;

import java.util.Arrays;

public class Group {

	private Student[] Group = new Student[10];

	public Group(Student[] group) {
		super();
		Group = group;

	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return Group;
	}

	public void setGroup(Student[] group) {
		Group = group;
	}

	public int numberOfStudents(Student[] group) {
		int number = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				number = number + 1;
				break;
			}
		}
		return number;
	}

	public void addStudent(Student st) throws MyException {
		if (this.numberOfStudents(Group) <= 10) {
			for (int i = 0; i < Group.length; i++) {
				if (Group[i] == null) {
					Group[i] = st;
					break;
				}
			}
		} else {
			throw new MyException();
		}
	}

	public void deleteStudent(int a) {
		for (int j = 0; j < Group.length; j++) {
			if (Group[j] != null && Group[j].getNumber() == a) {
				Group[j] = null;
				break;
			}

		}

	}

	public Student searchStudent(String name) {
		for (int k = 0; k < Group.length; k++) {
			if (Group[k] != null && Group[k].getName().equals(name)) {
				return Group[k];
			}
		}
		return null;

	}

	@Override
	public String toString() {
		return "Группа = " + Arrays.toString(Group);
	}

}
