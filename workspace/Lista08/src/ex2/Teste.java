package ex2;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import Ex1.Fatorial;

public class Teste {

	@Test(expected = UnsupportedOperationException.class)
	public void testFatorial() {
		Fatorial.fatorial(-5);
	}
	
	@Test
	public void testFatoral2(){
		assertTrue(Fatorial.fatorial(5).equals(BigInteger.valueOf(120)));
		assertTrue(Fatorial.fatorial(0).equals(BigInteger.valueOf(1)));
	}
}
