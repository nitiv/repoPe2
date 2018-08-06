package com.stackroute.Pe2;

public class Factorial
{
public String intfact(int num)
{
	int i,fact=1;
	for(i=1;i<=num;i++) {
		fact=fact*i;
	}
	
	String s= "The factorial of "+num+" is "+fact;
	
	
	
	return s;
}
public String longFactorial(long num)
{
	int i;
	long fact=1;
	for(i=1;i<=num;i++) {
		fact=fact*i;
	}
	
	String s= "The factorial of "+num+" is "+fact;
	
	
	
	return s;	
}
}