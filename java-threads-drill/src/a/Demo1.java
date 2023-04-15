package a;

import org.eldar.display.DoubleDisplay;

public class Demo1 {
 static DoubleDisplay display = new DoubleDisplay();
 
 
	public static DoubleDisplay getDisplay() {
	return display;
}


	public static void main(String[] args) throws InterruptedException {


		
		getDisplay().switchOn();
	//	getDisplay().leftPrint("hello");

		
	//	Thread.sleep(1000);
	//	getDisplay().rightPrint("hello");

	//	Thread.sleep(1000);
		
			Runner r1 = new Runner();
			Runner2 r2 = new Runner2();

//while(r1.state==true && r2.state==true) {
		r1.start();
		r2.start();
		
		
		

			
			//	display.switchOff();
	}			

	

}
