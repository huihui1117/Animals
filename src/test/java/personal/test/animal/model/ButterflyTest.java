package personal.test.animal.model;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class ButterflyTest {

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
	public void testButterfly() {
		Butterfly butterfly = new Butterfly();
		butterfly.walk();
		assertEquals("", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		butterfly.fly();
		assertEquals("I am flying", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		Butterfly caterpillar = new Butterfly(true);
		caterpillar.walk();
		assertEquals("I am crawling", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
		caterpillar.fly();
		assertEquals("", outContent.toString().replace("\r\n", ""));
		outContent.reset();
		
	}
}
