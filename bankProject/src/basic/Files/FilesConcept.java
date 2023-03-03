package basic.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import basic.Files.FilesConcept;

public class FilesConcept {

	public static void main(String[] args) throws IOException {
		FilesConcept alternativeFile = new FilesConcept();

		File study=alternativeFile.creation();
		System.out.println("file exist : " + study.exists());
		System.out.println("file path : " + study.getAbsoluteFile());
		alternativeFile.writing(study);
		System.out.println("file read : " + study.canRead());
		System.out.println("file write : " + study.canWrite());
		alternativeFile.reading(study);
		
	}

	public File creation() throws IOException {
		File file = new File("D:\\javafileslearn\\mytxtfile2.txt");
		if (file.createNewFile()) {
			System.out.println("I have created a file");
		} else {
			System.out.println("I cannot create a  file");
		}
		return file;
	}

	public void writing(File writefile) throws IOException {

		String abc = "Attitude Matters";
		FileWriter editfile = new FileWriter(writefile);
		editfile.write(abc);

		System.out.println("I am writing something");

		editfile.close();
	}
private void reading(File readfile) throws FileNotFoundException {
	Scanner	scanner = new Scanner(readfile);
	while(scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
	}
	scanner.close();
	}
}
