package com.stackroute.Pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;
public class Grades_test
{
	
	Grades obj= new Grades();
	int[] n= {86,65,98,77};
	/*int [] avg= {86,65,98,77};
	int [] minimum= {50,60,30};
	int [] maximum= {50,60,70};*/
	@Test
	public void test1()
	{
		assertEquals("The average is 81.50", obj.average(n));
	}
	@Test
	public void test2()
	{
		assertEquals("The minimum is 65", obj.min(n));
	}
	@Test
	public void test3()
	{
		assertEquals("The maximum is 98", obj.max(n));
	}
	@Test
	public void test4()
	{
		assertNotEquals("The minimum is 86",obj.min(n));
	}
	
}