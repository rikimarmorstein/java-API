import java.util.Scanner;

public class DemoFinal {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println(a+" + " + b+" = " + sum);
		//return; finnaly mitbazeha lamrot return 
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
			return;
		}finally {
			sc.close();
		System.out.println("Scanner closed");
		}
		System.out.println("SUCCESS");
		
	}

}
