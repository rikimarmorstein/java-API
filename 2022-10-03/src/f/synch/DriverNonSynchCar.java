package f.synch;

public class DriverNonSynchCar extends Thread {

	private int distance;
	private CarNonSynch car;
	
	
	
	public DriverNonSynchCar(String name, int distance, CarNonSynch car) {
		super(name);
		this.distance = distance;
		this.car = car;
	}
	
	
	@Override
	public void run() {
		synchronized (car) {
		this.car.drive(distance);
		}
	}
	
	
	
}
