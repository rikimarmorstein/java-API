package h;

public class MyTask implements Runnable {

	private static String name;
	private static String loser;
	
	
	
	
	public static String getName() {
		return name;
	}


	public static String getLoser() {
		return loser;
	}



	public synchronized static void setName(String name) {
		if (name==null) {
			MyTask.name = name;
		}else {
			loser = name;
		}
	}



	@Override
	public void run() {
		while(name==null) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " winner");
		System.out.println(loser + " lose");

	}

}
