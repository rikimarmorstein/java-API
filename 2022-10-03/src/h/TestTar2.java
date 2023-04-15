package h;

import java.util.Scanner;

public class TestTar2 {

	public static void main(String[] args) {

Tar2 t1 = new Tar2();
t1.start();

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
//while(str!= null) {
	t1.write = false;
	System.out.println("hello " + str);
	//break;
//}	

sc.close();
	}

}
