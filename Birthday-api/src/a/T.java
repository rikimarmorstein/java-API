package a;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {

		String a = "v";
		String b = "x";
		if (a == "v") {
			System.out.println("vdvs");
		}
		// String aaa = getIsSpecial();
		// if (aaa.equals("V")) {
		// System.out.println("hhhgh");
		// }

	}

	static String getIsSpecial() {
		Scanner ssc = new Scanner(System.in);
		System.out.println("enter V or X");
		String g = ssc.nextLine();
		// System.out.println(g);
		return g;

	}
}
