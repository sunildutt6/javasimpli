import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FHAssignment {

	public static void main(String[] args) throws IOException {

		createFileDemo1();//creating file first method
		createFileDemo2();//creating file second method
		createFileNIO();//creating file third method
		
		readFile();//reading file 
		
		
	}

	private static void createFileDemo1() throws IOException {
		File file = new File("e://files//demo//file1.txt");
		if (file.createNewFile()) {
			System.out.println("File created");
		} else {
			System.out.println("File already exists");
		}

		FileWriter fw = new FileWriter(file);
		fw.write("This is some text");
		fw.close();

	}
	
	private static void createFileDemo2() throws IOException {
		String data = "This is create by new method.";
		FileOutputStream fos = new FileOutputStream("e://files//demo//file2.txt");
		fos.write(data.getBytes());
		fos.close();
		System.out.println("done");
	}
	
	private static void createFileNIO() throws IOException {
		List<String> list = Arrays.asList("This is the first line","This is the second line");
		Files.write(Paths.get("e://files//demo//file3.txt"), list,
				StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
		
	}
	
	public static void readFile() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("e://files//demo//file3.txt"));
		int i;
		while((i = bf.read()) != -1) {
			System.out.print((char)i);
		}
		//System.out.println("file read");
	}

}
