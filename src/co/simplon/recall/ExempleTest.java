package co.simplon.recall;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExempleTest {

	@Test
	public void helloWorld() {
		//fail("Not yet implemented");
		assertEquals("hello World" , Exemple.helloWorld(""));
		assertEquals("hello manu" , Exemple.helloWorld("manu"));
	}

}
