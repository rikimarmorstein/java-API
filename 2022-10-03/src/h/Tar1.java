package h;

public class Tar1 extends Thread {

	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Reset");
for (int j = i; j > 0; j--) {
	System.out.println(j);
}	break;			
			}
		}
	}
	
}
