package f.synch;

import java.util.concurrent.TimeUnit;

public class CarNonSynch {

	private int number;
	private int km;
	
	
	
	
	public CarNonSynch(int number) {
		super();
		this.number = number;
	}



//this method is critical section
	public void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("car "+ number +": driver " + driver.getName() + " stardet at " + km + " for a distance of " + distance);
			this.km+=distance;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println("car "+ number +": driver " + driver.getName() + " ended at " + km );

	}
	 
	public void drive2(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("car "+ number +": driver " + driver.getName() );
		synchronized (this) {
					System.out.println( " stardet at " + km + " for a distance of " + distance);

		}
	this.km+=distance;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println("car "+ number +": driver " + driver.getName() + " ended at " + km );

	}
	 	
}
