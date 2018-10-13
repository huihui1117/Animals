package personal.test.animal;

import java.util.Arrays;
import java.util.stream.Collectors;

import personal.test.animal.model.Animal;
import personal.test.animal.model.Bird;
import personal.test.animal.model.Butterfly;
import personal.test.animal.model.Cat;
import personal.test.animal.model.Chicken;
import personal.test.animal.model.Clownfish;
import personal.test.animal.model.Dog;
import personal.test.animal.model.Dolphin;
import personal.test.animal.model.Duck;
import personal.test.animal.model.Fish;
import personal.test.animal.model.Frog;
import personal.test.animal.model.Parrot;
import personal.test.animal.model.Shark;

public class Solution {
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal[] animals = new Animal[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Chicken(true),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		
		System.out.println("Animals that can fly :" +
				Arrays.asList(animals).stream().filter(x -> x.isCanFly()).collect(Collectors.toList()).size()
		);
		
		System.out.println("Animals that can walk :" +
				Arrays.asList(animals).stream().filter(x -> x.isCanWalk()).collect(Collectors.toList()).size()
		);
		
		System.out.println("Animals that can swim :" +
				Arrays.asList(animals).stream().filter(x -> x.isCanSwim()).collect(Collectors.toList()).size()
		);
		
		System.out.println("Animals that can sing :" +
				Arrays.asList(animals).stream().filter(x -> x.getVoice().length() != 0).collect(Collectors.toList()).size()
		);
	
	}
}
