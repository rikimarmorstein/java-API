package a;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
	//	Scanner c= new Scanner(System.in);
	//	System.out.println("enter a date of birthday day");
	//	 System.out.println("month");
	//	 System.out.println("year");
	//	LocalDate birthday = LocalDate.of(c.nextInt(), c.nextInt(), c.nextInt());
	//	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd. MMM. yyyy");
	//	System.out.println(birthday.format(dtf));
//System.out.println(birthday);
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("enter a date of birthday [dd.mm.yyyy]");
	//	String date = sc.nextLine();
	//	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.mm.yyyy");
	//	System.out.println(LocalDate.parse(date,dtf));
		//day=LocalDate birthday;
//System.out.println(birthday);
		Set<Person>people=new HashSet<>();
		
		Person p1=new Person();
		people.add(p1);
		p1.setBirthday(LocalDate.of(2022, 1, 28));
		Person p2=new Person();
		people.add(p2);
		p2.setBirthday(LocalDate.of(2022, 1, 28));
		Person p3=new Person();
		people.add(p3);
		p3.setBirthday(LocalDate.of(2022, 3, 28));
		Person p4=new Person();
		people.add(p4);
		p4.setBirthday(LocalDate.of(2022,1, 28));
		Person p5=new Person();
		people.add(p5);
		p5.setBirthday(LocalDate.of(2022, 5, 28));
		Person p6=new Person();
		people.add(p6);
		p6.setBirthday(LocalDate.of(2022, 5, 28));
		Person p7=new Person();
		people.add(p7);
		p7.setBirthday(LocalDate.of(2022, 1, 28));
		Person p8=new Person();
		people.add(p8);
		p8.setBirthday(LocalDate.of(2022, 10, 21));
		Person p9=new Person();
		people.add(p9);
		p9.setBirthday(LocalDate.of(2022, 7, 28));
		
		LocalDate month = LocalDate.now();
	BirthdayStatistics.countMemebers((List<Person>) people);
	System.out.println(BirthdayStatistics.countMemebers((List<Person>)people));
	System.out.println(BirthdayStatistics.getHappyMonth((List<Person>)people));
	System.out.println(BirthdayStatistics.getSadlyMonth((List<Person>)people));	;
	System.out.println(BirthdayStatistics.getEvents((List<Person>)people));	;

		//System.out.println(month.getMonthValue());
	//	if (p8.getBirthday().getDayOfMonth()==month.getDayOfMonth()&&p8.getBirthday().getMonthValue() ==month.getMonthValue() ) {
		//	System.out.println(p8.getName() + " is celebrating his birthday today, he was born on " + p8.getBirthday());
	//	}
		//System.out.println(p.getBirthday().getMonthValue());
	printHappyMonth(people);
	printSadMonth(people);
	}
	public static void printHappyMonth(Set<Person> people) {
		int max=0;
		Month month = null;
		Month l = null;
		for (int i = 1; i <= 12; i++) {
			int sum=0;
			for (Person person : people) {
	if(person.getBirthday().getMonthValue()==i) {
			sum++;
			month = person.getBirthday().getMonth();
		}
}if(sum>max) {
	max=sum;
	l=month;
}
		}System.out.println(l);
}
	
	public static void printSadMonth(Set<Person> people) {
		int min=100;
		Month month = null;
		Month l = null;
		for (int i = 1; i <= 12; i++) {
			int sum=0;
			for (Person person : people) {
	if(person.getBirthday().getMonthValue()==i) {
			sum++;
			month = person.getBirthday().getMonth();
		}
}if(sum<min) {
	min=sum;
	l=month;
	}
		}System.out.println(l);
	}

	
}
