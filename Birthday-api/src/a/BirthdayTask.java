package a;

import java.time.LocalDate;
import java.util.Set;

public class BirthdayTask implements Runnable {

	private Set<Person> people;

	private static boolean isRunning = true;

	public BirthdayTask(Set<Person> people) {

		this.people = people;
	}

	@Override
	public void run() {
		while (isRunning) {
			checkDeadlines();
			try {
				// TimeUnit.HOURS.sleep(24);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void checkDeadlines() {
		LocalDate month = LocalDate.now();
		try {
			for (Person person : people) {
				if (person.getBirthday().getMonthValue() == month.getMonthValue()
						&& person.getBirthday().getDayOfMonth() == month.getDayOfMonth() && person.isPop() == true) {
					if (person.isSpecial() == true) {
						// special
						// System.out.println(person.getName() + " is celebrating his birthday today, he
						// was born on "
						// + person.getBirthday());
						// Thread.sleep(500);
						// System.out.println("HAPPY BIRTHDAY!!!! ");
						// no special
						SpecialBirthdayTask specialBirthdayTask = new SpecialBirthdayTask(person);
						Thread a = new Thread(specialBirthdayTask);
						a.start();
						person.setPop(false);
					} else {
						System.out.println(person.getName() + " is celebrating his birthday today, he was born on "
								+ person.getBirthday());
						person.setPop(false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cencelIsRunning() {
		isRunning = false;
	}

	public Set<Person> getPeople() {
		return people;
	}

}
