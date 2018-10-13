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
}
