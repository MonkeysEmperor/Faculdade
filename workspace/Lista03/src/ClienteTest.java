import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClienteTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	static private PrintStream stdout = System.out;
	static private PrintStream stderr = System.err; 
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	
	
	
	Cliente c = new Cliente ("Bruno", 10000);
	
	@Test
	public void testClienteString() {
		Cliente c2 = new Cliente ("Ronaldo");
		assertEquals (c2.getNome(), "Ronaldo");
	}

	@Test
	public void testClienteStringInt() {
		Cliente c2 = new Cliente ("Ronaldo", 88964);
		assertEquals (c2.getSaldo(), 88964, 10e-2);
	}

	@Test
	public void testSaque() {
		double saldo = c.getSaldo();
		c.saque(200);
		assertEquals(c.getSaldo(), saldo - 200, 10e-2);
	}

	@Test
	public void testDeposito() {
		double saldo = c.getSaldo();
		c.deposito(800);
		assertEquals(c.getSaldo(), saldo + 800, 10e-2);
	}

	@Test
	public void testImpressão() {
		c.impressão();
		String saida = "Nome do titular da conta: " + c.getNome() + "\n" + "Saldo: " + c.getSaldo() + "\n" + "Número da conta: " + c.getnConta() + "\n";
		assertEquals(saida, outContent.toString());
		
	}
	@Test
	public void testProxNoConta()
	{
		assertTrue(c.getnConta() < Cliente.getProxnConta());
	}

	@Test
	public void testComparaSaldo() {
		assertFalse(c.comparaSaldo(80000));
		
	}
	@Test
	public void testComparaSaldo2() {
		assertTrue(c.comparaSaldo(500));
		
	}

	@Test
	public void testComparaNome() {
		assertTrue(c.comparaNome("Bruno"));
		
	}
	@Test
	public void testComparaNome2() {
		assertFalse(c.comparaNome("Rogério"));
		
	}
	@After
	public void cleanUpStreams() {
	    System.setOut(stdout);
	    System.setErr(stderr);
	}

}
