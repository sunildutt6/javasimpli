package com.sunil.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreationDemo1 {

	public static void main(String[] args) throws IOException {

		createFileUsingFileOutputStreamClass();
	}
	
	private static void createFileUsingFileOutputStreamClass() throws IOException {
		String data = "This file is created with file output stream";
		FileOutputStream fos = new FileOutputStream("e://files//textfile1.txt");
		fos.write(data.getBytes());
		fos.close();
	}

}
