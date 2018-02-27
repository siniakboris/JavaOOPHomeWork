package com.gmail.siniakboris;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		Filter myFileFulter = new Filter("jpg");
		File myOneFolder = new File("D://OneFolder");
		File myTwoFolder = new File("D://TwoFolder/");
		
		if (!myTwoFolder.exists()) {
			myTwoFolder.mkdir();
		} 
		
		File[] fileList = myOneFolder.listFiles(myFileFulter);

		try {
			for (File file : fileList) {
				CopyFiles.copyFiles(file, new File("D://TwoFolder/" + file.getName()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
