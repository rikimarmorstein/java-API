package h;

import a.MyRunnable;

public class TestMyTask {

	public static void main(String[] args) {
MyTask r1 = new MyTask();

Threadim t1 = new Threadim();
Threadim t2 = new Threadim();
t1.setName("t1");
t2.setName("t2");

t1.start();
t2.start();
	}

}
