package com.sunil.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args) throws IOException {

		createFileUsingFileClass();

	}

	private static void createFileUsingFileClass () throws IOException {
		//creating file
		File file = new File("E://Files//txtFile.txt");
		if(file.createNewFile()) {
			System.out.println("file is created");
		}else {
			System.out.println("File already exists");
		}
		
		//writing in to the file
		
		FileWriter writer = new FileWriter(file);
		writer.write("This is created with using file class");
		writer.close();
	}

}
