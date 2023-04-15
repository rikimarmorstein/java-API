package b.sortingLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(106, "bbb", 25));
		list.add(new Person(105, "ddd", 20));
		list.add(new Person(107, "aaa", 30));
		list.add(new Person(103, "sss", 25));
		list.add(new Person(102, "aab", 20));
		list.add(new Person(101, "dsf", 30));
		
		System.out.println("other order (age)");
		Collections.sort(list, new PersonAgeComparator());
		System.out.println(list);
	}

}
