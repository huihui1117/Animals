package personal.test.animal.model;

public class Chicken extends Bird {

	private boolean isRooster;
	
	public Chicken() {
		super();
		this.isRooster = false;
	}
	
	public Chicken(boolean isRooster) {
		super();
		this.isRooster = isRooster;
	}

	@Override
	public void sing() {
		if (isRooster) {
			System.out.println("Cock-a-doodle-doo");
		}else {
			System.out.println("Cluck, cluck");
		}
		
	}
	
	@Override
	public void fly() {
		System.out.println("");
	}
}
