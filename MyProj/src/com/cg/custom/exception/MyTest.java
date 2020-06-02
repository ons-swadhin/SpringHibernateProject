package com.cg.custom.exception;

public class MyTest {

	public static void main(String[] args) throws Exception {
		 try
	        { 
	            // Throw an object of user defined exception 
	            throw new Exception("GeeksGeeks"); 
	        } 
	        catch (MyException ex) 
	        { 
	            System.out.println("Caught"); 
	  
	            // Print the message from MyException object 
	            System.out.println(ex.getMessage()); 
	        } 

	}

}
