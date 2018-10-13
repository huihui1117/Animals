package personal.test.animal.model;

public abstract class Animal{
	
	private String voice;
	private boolean canSwim;
	
	public Animal() {
		this.canSwim = false;
		this.voice = "";
	}

	public void walk() {
		System.out.println("I am walking");
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

	public void sing() {
		System.out.println(voice);		
	}
	
	public void swim() {
		if(canSwim) {
			System.out.println("I am swimming");
		}
	}
}
