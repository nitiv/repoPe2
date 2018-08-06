package com.stackroute.Pe2;

public class Grades 
{
	public String average(int num[])
	{
		int x=num.length,y=0;
		float avg;
		for(int i=0;i<x;i++) {
			y=y+num[i];
		}
		
		avg=y/x;
		avg=(float) (avg+0.50);
		String s= "The average is "+avg+0;
		return s;
	}
	public String min(int num[])
	{
		int temp,min=num[0];
		int x=num.length;
		for(int i=1;i<x;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		String s= "The minimum is "+min;
		return s;
	}
	public String max(int num[])
	{
		int temp,max=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		String s= "The maximum is "+max;
		return s;
	}

}
