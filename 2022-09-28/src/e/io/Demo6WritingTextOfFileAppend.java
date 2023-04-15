package e.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo6WritingTextOfFileAppend {

	public static void main(String[] args)  {

File file = new File("C:/temp/test.txt");

try(PrintWriter out = new PrintWriter(new FileWriter(file, true));){
	out.println("line 1");
	out.println("line 2");
	out.println("line 3");

	int val = 125;
	out.println(val);
	System.out.println("data written");
	
}catch(IOException e){
		e.printStackTrace();
	}

}
	

}
