package e.io;

import java.io.FileReader;
import java.io.IOException;

public class Demo7ReadTextFromFile {

	public static void main(String[] args) {

try(FileReader in = new FileReader("C:/temp/test.txt");){
	int c = in.read();
	while (c!=-1) {
		System.out.print((char)c);
		c=in.read();
	}
	
}catch (IOException e) {
	e.printStackTrace();
}



	}

}
