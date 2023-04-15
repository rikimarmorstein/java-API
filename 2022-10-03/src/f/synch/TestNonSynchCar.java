package f.synch;

public class TestNonSynchCar {

	public static void main(String[] args) {


		CarNonSynch car = new CarNonSynch(111);
		CarNonSynch car2 = new CarNonSynch(222);

		DriverNonSynchCar moshe = new DriverNonSynchCar("moshe", 100, car);
		DriverNonSynchCar lea = new DriverNonSynchCar("lea", 40, car);

			moshe.start();
			lea.start();
	}

}
