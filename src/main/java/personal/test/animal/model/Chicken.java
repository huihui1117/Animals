package personal.test.animal.model;

public class Chicken extends Bird {
	
	public Chicken() {
		super();
		setVoice("Cluck, cluck");
	}
	
	public Chicken(boolean isRooster) {
		super();
		if (isRooster) {
			setVoice("Cock-a-doodle-doo");
		}else {
			setVoice("Cluck, cluck");
		}
	}	
	
	@Override
	public void fly() {
		System.out.println("");
	}
}
