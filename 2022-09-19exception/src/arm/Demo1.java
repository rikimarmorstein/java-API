package arm;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {


		try(		Scanner sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				MaClosable c = new MaClosable();
					) {
			System.out.println("enter a");
			int a  = sc.nextInt();
			System.out.println("enter b");
			int b  = sc.nextInt();
			System.out.println(a +b);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
