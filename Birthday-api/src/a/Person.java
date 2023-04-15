package a;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private LocalDate Birthday;
	private static int counter;
	private boolean isSpecial;
	private boolean isPop = true;

	public Person() {
		super();
		this.id = ++counter;
		this.name = DateFactory.getName();// "Person " + counter;
		this.Birthday = DateFactory.getLocalDate();
		this.setSpecial(isSpecial);
	}

	public int compareTo(Person p) {
		return (this.Birthday.compareTo(p.Birthday));
		// return (this.Birthday.getMonthValue()-(p.Birthday.));//מיון לפי תאריכי
		// יוםהולדת
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {

		return Birthday;
	}

	public void setBirthday(LocalDate birthday) {

		Birthday = birthday;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Person.counter = counter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", Birthday " + DateUtil.BeautifyDate(Birthday) + ", Is he special? - "
				+ isSpecial + "]";
	}

	public boolean isSpecial() {
		return isSpecial;
	}

	public void setSpecial(boolean isSpecial) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert S if the man is special, if not - insert N");
		String special = s.nextLine();
		if (special.equals("S")) {
			this.isSpecial = true;
		} else if (special.equals("N")) {
			this.isSpecial = false;
		} else {
			System.out.println("error");
			setSpecial(isSpecial);
		}

	}

	public boolean isPop() {
		return isPop;
	}

	public void setPop(boolean isPop) {
		this.isPop = isPop;
	}

}
