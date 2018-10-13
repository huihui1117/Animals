package personal.test.animal.model;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class BirdTest {
	
	Bird bird = new Bird();
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void init() {
		bird = new Bird();
		
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@Test
	public void testWalk() {
		bird.walk();
		assertEquals("I am walking", outContent.toString().replace("\r\n", ""));
		
	}

	@Test
	public void testFly() {
		bird.fly();
		assertEquals("I am flying", outContent.toString().replace("\r\n", ""));
	}
	
	@Test
	public void testSing() {
		bird.sing();
		assertEquals("I am singing~", outContent.toString().replace("\r\n", ""));
	}
	
	@Test
	public void testDuckChicken() {
		Duck duck = new Duck();
		duck.sing();
		assertEquals("Quack, quack", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		duck.swim();
		assertEquals("I am swimming", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		
		Chicken chicken = new Chicken();
		chicken.sing();
		assertEquals("Cluck, cluck", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		chicken.fly();
		assertEquals("", outContent.toString().replace("\r\n", ""));
		
		
	}
}
