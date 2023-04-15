package a;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BirthdaySystemReminder {

	private Set<Person> people;
	private BirthdayTask task;
	private static Scanner scanner = new Scanner(System.in);
	private boolean systemOn = true;

	public BirthdaySystemReminder() {
		super();
		this.people = new HashSet<>();
		this.task = new BirthdayTask(people);
		Thread r = new Thread(task);
		r.setDaemon(true);
		r.start();
	}

	public static Person getPersonFromUser() {
		Person p = new Person();
		return p;
	}

	public void showMenu() {
		System.out.println();
		System.out.println("Enter Your Choice");
		System.out.println("Add member..........1");
		System.out.println("Delete member..........2");
		System.out.println("Print all members..........3");
		System.out.println("Print number the members..........4");
		System.out.println("The happy month..........5");
		System.out.println("The sad month..........6");
		System.out.println("Event printing.........7");
		System.out.println("Exit..........8");
	}

	public void startSystem() {

		while (systemOn) {

			// try {
			showMenu();
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				addPerson(getPersonFromUser());
				System.out.println("you added successfully");
				break;
			case "2":
				deletePerson(0);
				System.out.println("delete");
				break;
			case "3":
				printAll();
				break;
			case "4":
				printCountMembers();
				break;
			case "5":
				printHappyMonth();
				break;
			case "6":
				printSadMonth();
				break;
			case "7":
				printEvents();
				break;
			case "8":
				endSystem();
				return;
			default:
				System.out.println("error");
				break;
			}
			// } catch (Exception e) {
			// System.out.println("error " + e.getMessage());
			// }
		}
		scanner.close();
	}

	public void endSystem() {
		System.out.println("Thank you and goodbye");
		scanner.close();

		systemOn = false;
		BirthdayTask.cencelIsRunning();
		// System.exit(0);
	}

	public void addPerson(Person person) {
		people.add(person);

	}

	public void deletePerson(int id) {
		System.out.println("enter id to telete");
		id = scanner.nextInt();

		Iterator<Person> it = people.iterator();

		while (it.hasNext()) {
			if (it.next().getId() == id) {
				it.remove();
				System.out.println("delete");
				return;
			}
		}
	}

	public void printAll() {
		List<Person> list = new ArrayList<>(people);
		Collections.sort(list);
		System.out.println(list);
	}

	public void printCountMembers() {
		// System.out.println("The amount of my friends " + people.size());
		List<Person> p = new ArrayList<>(people);
		System.out.println("The amount of my friends " + BirthdayStatistics.countMemebers(p));
	}

	public void printHappyMonth() {
		// int max = 0;
		// Month month = null;
		// Month l = null;
		// for (int i = 1; i <= 12; i++) {
		// int sum = 0;
		// for (Person person : people) {
		// if (person.getBirthday().getMonthValue() == i) {
		// sum++;
		// month = person.getBirthday().getMonth();
		// }
		// }
		// if (sum > max) {
		// max = sum;
		// l = month;
		// }
		// }
		// System.out.println(l + " is happy month");

		int y = BirthdayStatistics.getHappyMonth(new ArrayList<>(people));
		Month month = Month.of(y);
		System.out.println(month + " is happy month");
	}

	public void printSadMonth() {
		// int min = 100;
		// Month month = null;
		// Month l = null;
		// for (int i = 1; i <= 12; i++) {
		// int sum = 0;
		// for (Person person : people) {
		// if (person.getBirthday().getMonthValue() == i) {
		// sum++;
		// month = person.getBirthday().getMonth();
		// }
		// }
		// if (sum > 0 && sum < min) {
		// min = sum;
		// l=month;
		// }
		// }
		// System.out.println(l + " is sad month");
		List<Person> p = new ArrayList<>(people);
		int y = BirthdayStatistics.getSadlyMonth(p);
		Month month = Month.of(y);
		System.out.println(month + " is sad month");
	}

	public void printEvents() {

		// for (int i = 1; i <= 12; i++) {
		// Month s = Month.of(i);
		// int sum = 0;
		// for (Person person : people) {
		// if (person.getBirthday().getMonthValue() == i) {
		// sum++;
		// }
		// }
		// System.out.println("Month: " + s + ", there is " + sum + " birthday");
		List<Person> p = new ArrayList<>(people);
		for (Entry<Integer, Integer> entry : BirthdayStatistics.getEvents(p).entrySet()) {
			Integer key = entry.getKey();
			Month mon = Month.of(key);
			Integer val = entry.getValue();
			System.out.println("Month: " + mon + ", there is " + val + " birthday");
		}

	}

}
