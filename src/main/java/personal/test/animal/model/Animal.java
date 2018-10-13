package personal.test.animal.model;

public abstract class Animal{
	
	private String voice;
	
	public void walk() {
		System.out.println("I am walking");
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public void sing() {
		System.out.println(voice);
		
	}
}
