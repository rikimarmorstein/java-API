package f.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import b.sortingLists.Person;

public class Demo4ObjectToFile {

	public static void main(String[] args) {

Person person = new Person(100, "lll", 20);

File file = new File("files/person.obj");
try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ){
	out.writeObject(person);
	System.out.println(person);
	System.out.println("was written to");
	System.out.println(file);
}catch(IOException e) {
	e.printStackTrace();
}
	}

}
