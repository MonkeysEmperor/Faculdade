package Ex6;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecebeCodigoTest {

	String a = "matriz 0-1 18 21";
	String b = "MaTrIz int 10 5";
	String c = "MATRIZ DOUBLE 10 5     ";
	String d = "Matrix dd";
	String e = "int";
	String f = "Matriz double -10 4";
	String g = "Matriz double  10 4";
	

	@Test
	public void testRecebeCodigo() {
		boolean error = false;
		try {
			RecebeCodigo.recebeCodigo(a);
			RecebeCodigo.recebeCodigo(b);
			RecebeCodigo.recebeCodigo(c);
		} catch (Exception e) {
			e.printStackTrace();
			error = true;
		}
		assertFalse(error);
	}

	@Test
	public void testRecebeCodigo2() {
		try {
			RecebeCodigo.recebeCodigo(d);

		} catch (StringNaoGrandeoSuficiente e) {
			assertTrue(e.getClass().equals(StringNaoGrandeoSuficiente.class));
			e.printStackTrace();

		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void testRecebeCodigo3() {
		try {
			RecebeCodigo.recebeCodigo(e);

		} catch (StringNaoGrandeoSuficiente e) {
			assertTrue(e.getClass().equals(StringNaoGrandeoSuficiente.class));
			e.printStackTrace();

		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void testRecebeCodigo4() {
		try {
			RecebeCodigo.recebeCodigo(f);

		} catch (IndicesInvalidos e) {
			assertTrue(e.getClass().equals(IndicesInvalidos.class));
			e.printStackTrace();

		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void testRecebeCodigo5() {
		try {
			RecebeCodigo.recebeCodigo(g);

		} catch (IndicesNaoEncontrados e) {
			assertTrue(e.getClass().equals(IndicesNaoEncontrados.class));
			e.printStackTrace();

		} catch (Exception e) {
			fail();
		}
	}

}
