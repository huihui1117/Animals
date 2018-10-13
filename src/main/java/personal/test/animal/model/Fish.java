package personal.test.animal.model;

public class Fish extends Animal{
	
	public String body;
	public String character;
	
	public Fish() {
		super();
		setCanSwim(true);
	}

	protected String getBody() {
		return body;
	}

	protected void setBody(String body) {
		this.body = body;
	}

	protected String getCharacter() {
		return character;
	}

	protected void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public void sing() {}
	
	@Override
	public void walk() {}	
	
}
