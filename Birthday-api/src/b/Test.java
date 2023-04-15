package b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Person> peoples = new ArrayList<>();

		peoples.add(new Person(101, "Yakov", "tel", 18.5, 14));
		peoples.add(new Person(102, "Hadel", "tel", 20.5, 14));
		peoples.add(new Person(103, "Skjnk", "tel", 25.0, 14));
		peoples.add(new Person(104, "Yakel", "tel", 114.5, 14));
		peoples.add(new Person(105, "Casel", "tel", 14.5, 14));

		printY(peoples);
		printBig(peoples);
		printSmall(peoples);
		zahir(peoples);
		mevugar(peoples);
		System.out.println(ddel(peoples));
	}

	// static =
	// public static List<Person> getPeoples() {
	// return getPeoples();
	// }

	public void printAll(List<Person> peoples) {
		System.out.println(peoples);
	}

	public void printNameAge(List<Person> peoples) {
		for (Person person : peoples) {
			System.out.println(person.getName() + ", " + person.getAge());
		}
	}

	public static void printY(List<Person> peoples) {
		for (Person person : peoples) {
			if (person.getName().startsWith("Y")) {
				System.out.println(person);
			}
		}
	}

	public static void print25(List<Person> peoples) {
		for (Person person : peoples) {
			if (person.getAge() > 25) {
				System.out.println(person);
			}
		}
	}

	public static void printBig(List<Person> peoples) {
		Collections.sort(peoples, new PersonAgeBig());
		System.out.println(peoples);
	}

	public static void printSmall(List<Person> peoples) {
		Collections.sort(peoples, new PersonAgeSmall());
		System.out.println(peoples);
	}

	public static void zahir(List<Person> peoples) {
		int min = 120;
		Person l = null;
		for (int i = 0; i < peoples.size(); i++) {
			if (peoples.get(i).getAge() < min) {
				min = peoples.get(i).getId();
				l = peoples.get(i);
			}
		}
		System.out.println(l);
	}

	public static void mevugar(List<Person> peoples) {
		int max = 0;
		Person l = null;
		try {
			for (int i = 0; i < peoples.size(); i++) {

				if (peoples.get(i).getAge() > max) {
					max = peoples.get(i).getId();
					l = peoples.get(i);
				}
			}
			System.out.println(l);
		} catch (Exception e) {
			System.out.println("dc");
		}

	}

	public static double memuzakm(List<Person> peoples) {
		double sum = 0;
		int y = 0;
		for (Person person : peoples) {
			sum = sum + person.getKnPerWeek();
			y++;
		}
		return sum / y;
	}

	public static List<Person> ddel(List<Person> peoples) {
		List<Person> list = new ArrayList<>();
		for (Person person : peoples) {
			if (person.getName().endsWith("el")) {
				list.add(person);
			}
		}
		return list;
	}

}
