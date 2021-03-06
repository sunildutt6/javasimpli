package com.sunil.filehandling.filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileReaderDemo {

	public static void main(String[] args) {
		List l = readFileInList("e://files//txtfile3.txt");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

	public static List<String> readFileInList(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

}
