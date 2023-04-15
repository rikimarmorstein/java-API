package e.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4WritingTextOfFile {

	public static void main(String[] args)  {

File file = new File("C:/temp/test.txt");

try(FileWriter out = new FileWriter(file);){
	out.write("line 1\n");
	out.write("line 2\n");
	out.write("line 3\n");
	Integer val = 125;
	out.write(val.toString());
	System.out.println("data written");
	
}catch(IOException e){
		e.printStackTrace();
	}

}
	

}
