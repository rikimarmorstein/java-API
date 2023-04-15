
public class TargilException {

	public static void main(String[] args) {
		
System.out.println(check("123"));
System.out.println(check("12a3"));
System.out.println(check("a12a3"));
	}
	
	public static int check(String s)  {
	while(s.length()>0) {
		try {
			return Integer.parseInt(s);
		}catch(Exception e) {
			s=s.substring(0, s.length()-1);
		}
	}return 0;
	}
	
	
}
