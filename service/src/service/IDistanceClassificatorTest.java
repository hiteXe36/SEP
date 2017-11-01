package service;

 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class IDistanceClassificatorTest {

	IDistanceClassificator _service;
	
	@Before
	public void setUp() throws Exception
	{
		_service = new IrDistanceClassificator();
	}
	

	@Test
	public void close_a()
	{		
		char mode = 'A';
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 0));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 5));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 7));
	}
	
	
	@Test
	public void close_b()
	{
		char mode = 'B';
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 1));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 4));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 5));
	}
	
	@Test
	public void middle_a()
	{
		char mode = 'A';
		assertEquals(DistanceClasses.MIDDLE, _service.determineDistanceClass(mode, 8));
		assertEquals(DistanceClasses.MIDDLE, _service.determineDistanceClass(mode, 10));
		assertEquals(DistanceClasses.MIDDLE, _service.determineDistanceClass(mode, 17));
	}
	
	@Test
	public void middle_b()
	{
		char mode = 'B';
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 6));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 8));
		assertEquals(DistanceClasses.CLOSE, _service.determineDistanceClass(mode, 10));
	}
	
	
	@Test
	public void far_a()
	{
		char mode = 'A';
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 18));
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 11));
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 24));
	}
	@Test
	public void far_b()
	{
		char mode = 'B';
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 11));
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 12));
		assertEquals(DistanceClasses.FAR, _service.determineDistanceClass(mode, 13));
	}
	
	@Test
	public void off_a()
	{
		char mode = 'A';
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 25));
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 27));
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 30));
	}
	
	@Test
	public void off_b()
	{
		char mode = 'B';
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 15));
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 22));
		assertEquals(DistanceClasses.OFF, _service.determineDistanceClass(mode, 30));
	}
	
	@Test(expected = Exception.class)
	public void negativA()
	{
		char mode = 'a';
		assertEquals(null , _service.determineDistanceClass(mode, -1));
		assertEquals(null , _service.determineDistanceClass(mode, 31));
	}
	@Test(expected = Exception.class)
	public void negativB()
	{
		char mode = 'b';
		assertEquals(null , _service.determineDistanceClass(mode, -1));
		assertEquals(null , _service.determineDistanceClass(mode, 31));
	}
	

}