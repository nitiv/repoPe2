package com.stackroute.Pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

public class Factorial_test 
{
	Factorial obj=new Factorial();
	@Test
	public void test1()
	{
		assertEquals("The factorial of 12 is 479001600", obj.intfact(12));
	}
	@Test
	public void test2()
	{
		assertEquals("The factorial of 2 is 2", obj.intfact(2));
	}
	@Test
	public void test3()
	{
		assertEquals("The factorial of 20 is 2432902008176640000", obj.longFactorial(20));
	}
	@Test
	public void test4()
	{
		assertNotEquals("10",obj.longFactorial(10));
	}
}
