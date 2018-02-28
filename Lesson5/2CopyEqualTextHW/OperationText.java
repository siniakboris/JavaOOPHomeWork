package com.gmail.siniakboris;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class OperationText {

	public String[] wordToArray(File file) {
		if (file != null) {

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {

				String stringResult = "";
				String text = "";

				for (; (text = br.readLine()) != null;) {
					stringResult = stringResult + text;
					String[] result = stringResult.split("[ -,.!?\\s]+");
					return result;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public String getEqualWord(File fileOne, File fileTwo) {

		String[] wordOne = wordToArray(fileOne);
		String[] wordTwo = wordToArray(fileTwo);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < wordOne.length; i++) {
			for (int j = 0; j < wordTwo.length; j++) {
				if (wordOne[i].equals(wordTwo[j])) {
					sb.append(wordOne[i] + " ");
					sb.toString();
				}
			}
		}
		return sb.toString();
	}

	public void saveEqualWordToFile(File fileOne, File fileTwo, File fileThree) {
		String text = getEqualWord(fileOne, fileTwo);
		if (text != null) {
			try (PrintWriter pw = new PrintWriter(fileThree)) {
				pw.println(text);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	}
}
