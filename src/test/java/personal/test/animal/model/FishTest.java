package personal.test.animal.model;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FishTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void init() {	
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testWalk() {
		Fish fish = new Fish();
		fish.walk();
		assertEquals("", outContent.toString().replace("\r\n", ""));
	}

	@Test
	public void testSing() {
		Fish fish = new Fish();
		fish.sing();
		assertEquals("", outContent.toString().replace("\r\n", ""));
	}
	
	@Test 
	public void testSwim() {
		Fish fish = new Fish();
		fish.swim();
		assertEquals("I am swimming", outContent.toString().replace("\r\n", ""));
	}
	
	@Test
	public void testShark() {
		Shark shark = new Shark();
		assertEquals("large and grey", shark.getBody());
		assertEquals("Eat other fish", shark.getCharacter());
	}
	
	@Test
	public void testClownfish() {
		Clownfish shark = new Clownfish();
		assertEquals("Small and colourful", shark.getBody());
		assertEquals("Makes jokes", shark.getCharacter());
	}
}
