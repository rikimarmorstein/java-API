package a;

import org.eldar.display.DoubleDisplay;

public class Runner2 extends Thread {
	public static String s;

	//public boolean state=true;	

	@Override
	public void run() {
		
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < j+1; i++) {
				Demo1.getDisplay().leftPrint("* ");
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}Demo1.getDisplay().leftPrintln();

		}s = "ss";
		if(Runner.getS()=="ss") {
			try {
				Thread.sleep(3000);
			Demo1.getDisplay().clearLeftPannel();
			Demo1.getDisplay().clearLeftPannel();
				Thread.sleep(3000);
				Demo1.getDisplay().rightPrintln("Good Bye");
				Demo1.getDisplay().leftPrintln("Good Bye");
				Thread.sleep(3000);
				Demo1.getDisplay().switchOff();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static String getS() {
		return s;
	}
}
