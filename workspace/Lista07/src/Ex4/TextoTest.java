package Ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextoTest {

	@Test(expected=NumberFormatException.class)
	public void testSomarValorChar() {
		String s1 = "123456";
		String s2 = "Abc5sd";
		String s3 = "111111";
		String[] s = {s1, s2, s3};
		Texto t = new Texto(s);
		int a = t.somarValorChar();
		assertEquals (a, 123456);
	}
	
	@Test
	public void testSomarValorChar2(){
		String s1 = "123456";
		String s2 = "111111";
		String s3 = "111111";
		String[] s = {s1, s2, s3};
		Texto t = new Texto(s);
		int a = t.somarValorChar();
		assertEquals (a, 123456 + 222222);
	}
	

}
