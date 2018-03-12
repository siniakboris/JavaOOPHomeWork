package com.gmail.siniakboris;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableToFile {
	
	public static void saveToFile(Object object, File file) throws IOException {
		if (object == null || file == null) {
			throw new IllegalArgumentException();
		}
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(object);
		} catch (IOException e) {
			throw e;
		}
	}

	public static Object loadFromFile(File file) throws IOException, ClassNotFoundException {
		if (file == null) {
			throw new IllegalArgumentException();
		}
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (IOException e) {
			throw e;
		}
	}
}
