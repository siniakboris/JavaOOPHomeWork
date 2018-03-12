package com.gmail.siniakboris;

public class NullCheck {
	public static final int NOT_NULL = 42;

	public static int checkNull(Object a, Object b) {
		if (a == null && b == null) {
			return 0;
		}
		if (a != null && b == null) {
			return -1;
		}
		if (a == null && b != null) {
			return 1;
		}
		return NOT_NULL;
	}
}
