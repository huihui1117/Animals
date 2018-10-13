package personal.test.animal.model;

public class Parrot extends Bird{
	
	public Parrot (Animal animal) {
		setVoice(animal.getVoice());
	}
	
	public Parrot (String sound) {
		setVoice(sound);
	}
}
