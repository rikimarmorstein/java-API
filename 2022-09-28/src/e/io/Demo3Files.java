package e.io;

import java.io.File;
import java.io.IOException;

public class Demo3Files {

	public static void main(String[] args) throws IOException {


		File dir = new File("C:\\temp");
		File file = new File(dir, "test.txt");
		System.out.println(dir);
		System.out.println(file);
		
		if (dir.exists()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
			dir.mkdirs();
			System.out.println("directory created");
		}
		
		
		if (file.exists()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
			file.createNewFile();
			System.out.println("file created");
		}
		
	}

}
