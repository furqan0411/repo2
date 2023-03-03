package basic.Files;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		
File f =new File("D:\\javafileslearn\\furqanfile.txt");
		
if(f.createNewFile()) {
	
	System.out.println("file created");
}

else {
	System.out.println("error occured during file creation");
}
	}

}
