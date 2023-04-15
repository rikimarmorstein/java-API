package h;

import java.util.Scanner;

public class Tar2 extends Thread {

	public boolean write = true;
	
	@Override
	public void run() {
		System.out.println("Enter your name");

		try {
			Thread.sleep(5000);
			while (write) {
				System.out.println("The system is waiting for you to enter your name");

				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
