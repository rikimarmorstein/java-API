package h;

public class TestTar4 {

	public static void main(String[] args) throws InterruptedException {

Runner  t1 = new Runner("t1");
Runner  t2 = new Runner("t2");

t1.setOther(t2);
t2.setOther(t1);

t1.start();
t2.start();

t1.join();
t2.join();

System.out.println("t1 "+ (t1.isWinner() ?  "won": "lose"));
System.out.println("t2 "+ (t2.isWinner() ?  "won": "lose"));
	
	}
	

}
