package f.synch;

public class Test {

	public static void main(String[] args) {

Car car = new Car(111);
Car car2 = new Car(222);

Driver moshe = new Driver("moshe", 100, car);
Driver lea = new Driver("lea", 40, car);

	moshe.start();
	lea.start();

	
	}

}
