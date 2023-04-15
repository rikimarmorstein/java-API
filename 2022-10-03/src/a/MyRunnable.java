package a;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " - " + thread.getName());
		}		
		
	}

}
