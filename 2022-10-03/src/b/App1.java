package b;

public class App1 {

	public static void main(String[] args) throws InterruptedException {

		
SleepingThread t1 = new  SleepingThread("t1");
System.out.println("state: " + t1.getState());

SleepingThread t2 = new  SleepingThread("t2");

t1.start();
System.out.println("state: " + t1.getState());

Thread.sleep(500);
System.out.println("state: " + t1.getState());

//Thread.sleep(10000);
t1.join();//make main sleep until t1 is terminated - run doing return
System.out.println("state: " + t1.getState());

t2.start();
	}

}
