package horses;

public class BadHorses {

	public void ride() throws HorseException {
		if(Math.random()<0.8) {
			System.out.println("bad horse riding");
		}else {
			throw new HorseException("kik");
		}
	}
	
}
