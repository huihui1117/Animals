package personal.test.animal.model;

public class Duck extends Bird{

	public Duck() {
		super();
		setVoice("Quack, quack");
	}	
	
	public void swim() {
		System.out.println("I am swimming");
	}
}
