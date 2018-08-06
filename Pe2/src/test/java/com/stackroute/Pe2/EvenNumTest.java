package com.stackroute.Pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;
public class EvenNumTest
{
	
	EvenNum obj = new EvenNum();
	@Test
	public void Test()
	{
		assertEquals( false, EvenNum.isEven(3));
	}
	@Test
	public void testpal2()
	{
		assertEquals(true, EvenNum.isEven(2));
	}
	@Test
	public void testpal3()
	{
		assertNotEquals(true,EvenNum.isEven(3));
	}
	
}