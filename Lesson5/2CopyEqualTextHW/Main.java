package com.gmail.siniakboris;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File fileOne = new File("E:\\fileOne.txt");
		File fileTwo = new File("E:\\fileTwo.txt");
		File fileThree = new File("E:\\fileThree.txt");

		if (!fileThree.exists()) {
			try {
				fileThree.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		OperationText text = new OperationText();
		text.saveEqualWordToFile(fileOne, fileTwo, fileThree);

	}

}
