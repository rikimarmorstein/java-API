package h;

public class Tar3 extends Thread {

	public boolean test = true;

	@Override
	public void run() {
		
		
			try {Thread.sleep(10000);
				if (Math.random()<0.7) {
					
					System.out.println("Valid credit number");
					test = true;
				}else {
					System.out.println("Invalid credit number");
					test = false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
}
