package c;

public class App1 {

	public static void main(String[] args) {


		Builder builder= new Builder(100, 100, "&");
		Cutter cutter = new Cutter(builder);
		Builder builder2= new Builder(100, 100, "*");
		Cutter cutter2 = new Cutter(builder2);
		builder.start();
		cutter.start();
		builder2.start();
		cutter2.start();
	}

}
