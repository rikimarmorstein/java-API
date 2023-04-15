package h1;

public class Name {

	private static String name;
	
	
	public synchronized static void setName(String myname) {
		if(name==null) {
			name= myname;
			System.out.println(myname + " winner");
		}else {
			System.out.println(myname +" lose");
		}
	}
	
}
