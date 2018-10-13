package personal.test.animal.model;

public abstract class Animal{
	
	private String voice;
	private boolean canSwim;
	private boolean canWalk;
	private boolean canFly;
	
	public Animal() {
		this.canSwim = false;
		this.canWalk = true;
		this.canFly = false;
		this.voice = "";
	}

	public void walk() {
		if (isCanWalk()) {
			System.out.println("I am walking");
		}
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}	
	
	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void sing() {
		System.out.println(voice);		
	}
	
	public void fly() {
		if (canFly) {
			System.out.println("I am flying");
		}
	}
	
	public void swim() {
		if(canSwim) {
			System.out.println("I am swimming");
		}
	}
}
