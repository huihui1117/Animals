package personal.test.animal.model;

public class Butterfly {

	private boolean isCaterpillar;
	
	public Butterfly(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}

	public Butterfly() {
		super();
		this.isCaterpillar = false;
	}

	public void fly() {
		if (!isCaterpillar) {
			System.out.println("I am flying");
		}
	}
	
	public void walk() {
		if (isCaterpillar) {
			System.out.println("I am crawling");
		}
	}
}
