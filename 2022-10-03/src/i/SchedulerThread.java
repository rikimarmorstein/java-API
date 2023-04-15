package i;

public class SchedulerThread extends Thread {
	private static boolean isRunning = true;
//Task task = new Task(getPriority(), getName(), null);

	@Override
	public void run() {
		while (isRunning) {
			Scheduler.checkDeadlines();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void cancelIsRunning() {
		isRunning = false;
	}

}
