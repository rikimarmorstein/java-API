package i;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduler {

	private static List<Task> tasks = new ArrayList<>();
	private boolean monitoringActiva;
	private Long chekRateMilis;
	private SchedulerThread t = new SchedulerThread();

	public void doTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id from the task isDone");
		int id = sc.nextInt();
		for (Task task : tasks) {
			if (task.getId() == id) {
				task.done = true;
				System.out.println(task);
				// sc.close();
			}
		}

	}

	public Scheduler() {
		// startMonitoringTasks();
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(int id) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				tasks.remove(id);
			}
		}
	}

	public void displayTasks() {
		System.out.println(tasks);
	}

	public Task getTask(int id) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				return task;
			}
		}
		return null;

	}

	public List<Task> getAllTasks() {
		for (Task task : tasks) {
			System.out.println(task);
		}
		return tasks;
	}

	public List<Task> getAllTasksDueUntil(LocalDateTime loc) {
		List<Task> list = new ArrayList<>();
		for (Task task : tasks) {
			if (task.getDeadline() == loc) {
				list.add(task);
			}
		}
		return list;
	}

	public void startMonitoringTasks() {
		t.setDaemon(true);
		t.start();
	}

	public void stopMonitoringTasks() {
		t.cancelIsRunning();
	}

	public static void checkDeadlines() {
		LocalDateTime now = LocalDateTime.now();
		try {
			for (Task task : tasks) {
				if (task.getDeadline().isBefore(now) && !task.isAlertPopped() && task.done == false) {
					task.setAlertPopped(true);
					System.out.println("Deadline alert" + task);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
