package c;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Cutter extends Thread {
	
	private Builder builder;

	public Cutter(Builder builder) {
		super();
		this.builder = builder;
	}
	
	
	@Override
	public void run() {
		try {
		Random random = new Random();
			TimeUnit.SECONDS.sleep(random.nextInt(3, 7));
			while (builder.isAlive()) {
			System.out.println();
			TimeUnit.SECONDS.sleep(random.nextInt(3, 7));}
	//	for (int i = 0; i <5; i++) {
		
			//	int second = (int)(Math.random()*4)+3;
			//	int second = random.nextInt(3, 7);
			//	Thread.sleep( (long) ((Math.random()*4000)+3000));
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	
	}
}
