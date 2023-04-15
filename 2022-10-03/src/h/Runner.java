package h;

public class Runner extends Thread {

	private Runner other;
private boolean winner;



public Runner(String name) {
	super(name);
}

public boolean isWinner() {
	return winner;
}


public void setOther(Runner other) {
	this.other=other;
}

	@Override
	public void run() {
for (int i = 1; i <= 100; i++) {
	System.out.println(i + " - " + getName());
}
synchronized (Runner.class) {
	if (isInterrupted()) {
		this.winner=true;
		other.interrupt();
		System.out.println(getName() + " won!!!!!!!!!!!!!");
	}else {
	System.out.println(getName() + " lose------------------");
}
	
}
	
	
	}}


