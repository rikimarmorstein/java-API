package f.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import b.sortingLists.Person;

public class Demo5ObjectToFile2 {

	public static void main(String[] args) {


		// serialize the object to stream and send it to file
				File file = new File("files/person.obj");

				try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
					Person person = (Person) in.readObject();
					System.out.println(person);
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}

			}

		}
		
