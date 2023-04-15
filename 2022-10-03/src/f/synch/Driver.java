package f.synch;

public class Driver extends Thread {

	private int distance;
	private Car car;
	
	
	
	public Driver(String name, int distance, Car car) {
		super(name);
		this.distance = distance;
		this.car = car;
	}
	
	
	@Override
	public void run() {
		this.car.drive(distance);
	}
	
	
	
}
