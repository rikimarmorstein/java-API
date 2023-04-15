package d;

import java.util.concurrent.TimeUnit;

public class TestReserCounter {

	public static void main(String[] args) throws InterruptedException {

ResetCounter t1 = new ResetCounter();
t1.start();

TimeUnit.SECONDS.sleep(3);
t1.interrupt();

TimeUnit.SECONDS.sleep(5);
t1.interrupt();
	}

}
