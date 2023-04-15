import java.beans.Expression;

public class CallStack {

	public static void main(String[] args) {
		
	
		String s="a123";

		try {
		
		int x=check(s);
		System.out.println(x);
		}catch(Exception e) {
int x=check2(s);
System.out.println(x);
}
	}
		public static int check(String s) throws NumberFormatException {
		int val=Integer.parseInt(s);
				return val;
		}
		
		public static int check2(String s)  {
			try {
			int val=Integer.parseInt(s);
					return val;
			}catch (Exception e) {
				return 0;
			}
		}
}
