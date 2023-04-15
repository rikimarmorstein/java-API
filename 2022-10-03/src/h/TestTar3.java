package h;

import java.util.Scanner;

public class TestTar3 {

	public static void main(String[] args) throws InterruptedException {

		Tar3 t1 = new Tar3();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of credit");

		int credit = sc.nextInt();
		t1.start();

		Thread.sleep(11000);
		if (t1.test == true) {

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter id and number of car");
			int id = sc2.nextInt();
			int numberOfCar = sc2.nextInt();

			System.out.println("Refueling operation");

			sc2.close();
		}
		sc.close();

	}
}
