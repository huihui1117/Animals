package personal.test.animal.model;

public class Butterfly extends Animal{
	
	public Butterfly(boolean isCaterpillar) {
		super();
		
		if (isCaterpillar) {
			setCanFly(false);
			setCanWalk(true);
		}else {
			setCanFly(true);
			setCanWalk(false);
		}
	}

	public Butterfly() {
		super();
		setCanFly(true);
		setCanWalk(false);
	}	
}
