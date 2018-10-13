package personal.test.animal.model;

public class Fish extends Animal{

	@Override
	public void sing() {}
	
	@Override
	public void walk() {}
	
	public void swim() {
		System.out.println("I am swimming");
	}
}
