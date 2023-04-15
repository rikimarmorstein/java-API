package i;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	private static final Scanner scanner = new Scanner(System.in);
	private static int nextTaskId = 1;

	public static Task getTaskFromUser() {
		System.out.print("enter task description: ");
		String description = scanner.nextLine();
		System.out.println("enter time hh:mm:ss ");
		String time = scanner.nextLine();
		LocalDateTime deadline = LocalDateTime.of(LocalDate.now(), LocalTime.parse(time));

		Task task = new Task(nextTaskId++, description, deadline);
		System.out.println("you added successfully");
		return task;
	}

	public static String beautifyDate(LocalDateTime deadline) {

		LocalDate ld = deadline.toLocalDate();
		String dat = ld.format(DateTimeFormatter.ofPattern("d/MM/yyyy"));

		// DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalTime ldt = deadline.toLocalTime();
		String time = ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
		String g = dat + " " + time;
		return g;

		// String dat = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		// LocalDate da = LocalDate.parse(dat);
		// String da = dat + " " + time;
		// return da;
		// date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public static void print() {
		System.out.println();
		System.out.println("Enter Your Choice");
		System.out.println("Add task..........1");
		System.out.println("Delete task..........2");
		System.out.println("Print all tasks..........3");
		System.out.println("Print all tasks.........4");
		System.out.println("Start traching tasks ..........5");
		System.out.println("End traching tasks..........6");
		System.out.println("Perform a task.........7");
		System.out.println("Exit..........8");
	}

	public static void main(String[] args) {
		Scheduler csh = new Scheduler();
		// scanner = new Scanner(System.in);
		boolean systemOn = true;
		while (systemOn) {
			print();
			try {
				System.out.println("enter your choice");
				String input = scanner.nextLine();
				switch (input) {
				case "1":
					csh.addTask(getTaskFromUser());
					break;
				case "2":
					csh.removeTask(nextTaskId);
					break;
				case "3":
					csh.getAllTasks();
					break;
				case "4":
					csh.displayTasks();
					break;
				case "5":
					csh.startMonitoringTasks();
					break;
				case "6":
					csh.stopMonitoringTasks();
					break;
				case "7":
					csh.doTask();
					break;
				case "8": {
					System.out.println("Bye");
					systemOn = false;
					return;
				}
				default:
					System.out.println("error");
					break;
				}

			} catch (Exception e) {
				System.out.println("error " + e.getMessage());
			} // scanner.close();
		}
		//

	}

}
