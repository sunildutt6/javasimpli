package com.sunil.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileCreationDemo2 {

	public static void main(String[] args) throws IOException {

		createFileIn_NIO();
	}

	private static void createFileIn_NIO() throws IOException {
		String data = "This file is created with file not input output class.";
		Files.write(Paths.get("e://Files//txtfile2.txt"), data.getBytes());

		List<String> lines = Arrays.asList("This list will be in the first line",
				"This list will be in the second line", "This list will be in the third line",
				"This list will be in the forth line");
		Files.write(Paths.get("e://Files//txtfile3.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

}
