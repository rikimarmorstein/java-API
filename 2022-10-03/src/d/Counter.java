package d;

import java.util.concurrent.TimeUnit;

public class Counter extends Thread {

	
	
	@Override
	public void run() {
		while (true) {
			System.out.println("-----");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//here we write the response to interrput
			System.out.println("thread interrupded and will stop");
			break;
}
		
		}
	}
	
}
