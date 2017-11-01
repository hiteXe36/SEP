package wrapper;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISensorBoundaryClassTest {

	@Test
	public void testBoundaryClass() {
	ISensorBoundaryClass bc = new ISensorBoundaryClass();
	//TODO
	assertEquals(3, bc.wertUmwandlungCM((char)0));
	
	assertEquals(29, bc.wertUmwandlungCM((char)255));
	}
}
