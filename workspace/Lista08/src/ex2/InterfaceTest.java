package ex2; 
import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Ignore;
import org.junit.Test;

import Ex1.InterfaceFatorial;

public class InterfaceTest {
	
	
	
	@Ignore
	public void testInterfaceFatorial() {
		InterfaceFatorial.main(null);
	}

	@Test
	public void testActionPerformed() throws AWTException {
		Robot a = new Robot();
		InterfaceFatorial j = InterfaceFatorial.createAndShowWindow();
		a.delay(300);
		a.keyPress(KeyEvent.VK_5);
		a.keyRelease(KeyEvent.VK_5);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		a.delay(300);
		assertTrue(j.getAnswerText().equals("120"));
		
		
	}

}
