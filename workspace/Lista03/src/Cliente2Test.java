import static org.junit.Assert.*;

import org.junit.Test;


public class Cliente2Test {

	Cliente2 c = new Cliente2("Mr.Bean", 500);

	@Test
	public void testGetnClientesBloq() {
		c.saque(600);
		Cliente2 c2 = new Cliente2 ("Chaplin", 700);
		c2.saque(800);
		assertEquals(Cliente2.getnClientesBloq(), 2);
	}

	@Test
	public void testSaque() {
		c.saque(501);
		assertFalse(c.saque(200)); //não pode sacar
	}
	
	@Test
	public void testSaque4() {
		c.saque(501);
		assertTrue(c.getBloquado()); //está bloqueado
	}

	
	@Test
	public void testSaque2() {
		assertTrue(c.saque(450)); // consegue sacar
	}
	
	@Test
	public void testSaque3() {
		c.saque(800); //bloqueou
		c.deposito(1000); //desbloqueou
		assertTrue(c.saque(120)); //consegue sacar
	}
	
	@Test
	public void testDeposito() {
		c.saque(5000);
		c.deposito(8000);
		assertFalse(c.getBloquado());
	}

	
}
