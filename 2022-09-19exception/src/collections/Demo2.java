package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		List list = new ArrayList() ;
		list.add("aaa");
		list.add(5);
		list.add(5.3);
		list.add(new Scanner(System.in));
System.out.println(list);

String str = (String) list.get(0);

List<String> listOfString = new ArrayList<>();
listOfString.add("aaa");
// listOfString.add(a);
listOfString.add("bbb");

str = listOfString.get(0);

System.out.println(listOfString);


	}

}
