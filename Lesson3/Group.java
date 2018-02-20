package com.gmail.siniakboris;

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

	public int numberOfStudents() {
		int number = 0;
		for (int i = 0; i < Group.length; i++) {
			if (Group[i] != null) {
				number = number + 1;
			}
		}
		return number;
	}

	public void addStudent(Student st) throws MyException {
		if (st != null) {
			for (int i = 0; i < Group.length; i++) {
				if (Group[i] == null) {
					Group[i] = st;
					return;
				}
			}
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

	public void toPrintGroup() {
		for (int i = 0; i < Group.length; i++) {
			if (Group[i] != null) {
				System.out.println("Номер зачетки: " + Group[i].getNumber() + ", имя студента: " + Group[i].getName()
						+ ", возраст: " + Group[i].getAge() + ", пол: " + Group[i].getSex());
			}
		}

	}

}
