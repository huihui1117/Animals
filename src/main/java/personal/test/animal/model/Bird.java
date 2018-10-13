package personal.test.animal.model;

public class Bird extends Animal{	
	
	public Bird() {
		super();
		setVoice("I am singing~");
	}

	public void fly() {
		System.out.println("I am flying");
	}
}
