package b;

import java.util.Comparator;

public class PersonAgeSmall implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return Double.compare(p2.getAge(), p1.getAge());
		// return p1.getAge()-p2.getAge();
	}

}
