package a;

public class SpecialBirthdayTask implements Runnable {

	private static boolean isRunning = true;
	private Person person;

	public SpecialBirthdayTask(Person person) {

		this.person = person;
	}

	@Override
	public void run() {
		System.out.println(person.getName() + " - special birthday");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("HAPPY BIRTHDAY!!!! ");
	}

}
