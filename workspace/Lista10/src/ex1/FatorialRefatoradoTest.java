package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialRefatoradoTest {

	@Test
	public void testFatorial() {
		
		assertTrue(FatorialRefatorado.fatorial(5) == 120);
	}

}
