package com.cg.test;

public class MyGeneric {

	public static void main(String[] args) {
		
		getError(new Student("Abc", "100"));

	}
	
	public static <T> void getError(T t)
	{
		if (t instanceof Student)
		{
			System.out.println(((Student) t).getName());
		}
	}

}
