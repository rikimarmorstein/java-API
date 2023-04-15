package a;

import org.eldar.display.DoubleDisplay;


public class Runner extends Thread {

	public static String s = "l";

//public boolean state;

	@Override
	public void run() {
		
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				Demo1.getDisplay().rightPrint("* ");
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}Demo1.getDisplay().rightPrintln();

		}s = "ss";
if(Runner2.getS()=="ss") {
	try {
		Thread.sleep(3000);

	Demo1.getDisplay().clearRightPannel();
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
