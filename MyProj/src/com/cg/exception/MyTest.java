package com.cg.exception;

public class MyTest {
	
	public static void main(String args[])
	{
		
		try
		{
			int a = 1/0;
			throw new MyException("GeeksGeeks");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
