/**
 * 
 */
package basic.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class FilesExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FilesExample filesExample = new FilesExample();
		File fileName = filesExample.createFile("fileExample");
		System.out.println("new file : " + fileName.createNewFile());
		System.out.println("file exist : " + fileName.exists());
		System.out.println("file path : " + fileName.getAbsoluteFile());
		System.out.println("file read : " + fileName.canRead());
		System.out.println("file write : " + fileName.canWrite());
		filesExample.writeFile(fileName); 
		filesExample.readFile(fileName);
		//System.out.println("file delete : " + fileName.delete());
		if(fileName.exists()) {
		System.out.println("file is already exist");
		}
		else {
		System.out.println("file is not available");
		filesExample.createFile("fileExample");
		System.out.println("file is created");
		}

		}
		public File createFile(String fileName) 
		
		{
		System.out.println("file start");
		File file = new File("F:\\work\\Batch2023Jan\\"+fileName+".txt");
		System.out.println("file end");
		return file;
		}

		public void writeFile(File fileName) throws IOException {
		String data = "we are writing data into a file";
		String appendData = "\n we are in training batch dec 2022";
		FileWriter fileWriter = new FileWriter(fileName);
		fileWriter.write(data);
		fileWriter.append(appendData);
		fileWriter.close();

		}
		public void readFile(File fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(fileName);
		while(scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
		}
		scanner.close();

		
	}

}
