package b;

import java.util.Comparator;

public class PersonAgeBig implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return Double.compare(p1.getAge(), p2.getAge());
		// return p1.getAge()-p2.getAge();
	}

}
