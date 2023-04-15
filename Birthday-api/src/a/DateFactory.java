package a;

import java.time.LocalDate;
import java.util.Scanner;

public class DateFactory {

	public static LocalDate getLocalDate() {
		Scanner c = new Scanner(System.in);
		// System.out.println("enter a date of birthday: year");
		// System.out.println("month");
		// System.out.println("day");
		// LocalDate birthday = LocalDate.of(c.nextInt(), c.nextInt(), c.nextInt());
		//
		// return birthday;

		System.out.println("enter a date of birthday: year");
		int year = c.nextInt();
		System.out.println("month");
		int month = c.nextInt();
		System.out.println("day");
		int day = c.nextInt();
		// c.close();
		// int day = (int) (Math.random() * 27) + 1;
		// int month = (int) (Math.random() * 11) + 1;
		// int year = (int) (Math.random() * 50) + 1960;
		// return LocalDate.of(year, month, day);
		return LocalDate.of(year, month, day);
	}

	public static String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name");
		String name = s.nextLine();
		// s.close();
		return name;

	}

	// public static String getIsSpecial() {
	// Scanner s = new Scanner(System.in);
	// System.out.println("Insert S if the man is special, if not - insert N");
	// String special = s.nextLine();
	// return special;

	// }
}
