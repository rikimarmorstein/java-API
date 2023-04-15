package h;

public class TestTar1 {

	public static void main(String[] args) throws InterruptedException {


		Tar1 t1 = new Tar1();
		t1.start();
		
		
		Thread.sleep(3000);
		t1.interrupt();
	}

}
