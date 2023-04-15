package horses;

public class Test {

	public static void main(String[] args) {

GoodHorses goodhorse = new GoodHorses();
goodhorse.ride();
goodhorse.ride();
goodhorse.ride();

BadHorses  badhorse = new BadHorses();
try {
	badhorse.ride();
	badhorse.ride();
	badhorse.ride();

}catch(HorseException e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
System.out.println("swiching horses");
goodhorse.ride();
}catch (Exception e) {
	e.printStackTrace();
}finally {
	System.out.println("Finally: feed the horses");
}
	}

}
