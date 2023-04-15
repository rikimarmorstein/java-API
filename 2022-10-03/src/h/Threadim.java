package h;

public class Threadim extends Thread {

	
	@Override
	public void run() {
for (int i = 1; i <= 100; i++) {
	System.out.println(this.getName() +  " " + i);
}MyTask.setName(this.getName());

	}
}
