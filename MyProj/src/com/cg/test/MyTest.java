package com.cg.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

	public static void main(String[] args) {
		
		BigDecimal num = BigDecimal.valueOf(19);
		BigDecimal one  = BigDecimal.valueOf(39);
		BigDecimal two  = BigDecimal.valueOf(5);
	  //  System.out.println(one.remainder(two).compareTo(new BigDecimal("0"))==0);
		 System.out.println(isPrime(new BigDecimal("234987389478239")));
		
		
		
	}
	private static boolean isPrime(BigDecimal n)
	{
		BigDecimal one = new BigDecimal("1");
		BigDecimal two = new BigDecimal("2");
		
		 if (n.compareTo(one) ==-1) {
             return false;
         }
         if (n.compareTo(two) == 0) {
             return true;
         }
         
         BigDecimal end = MyTest.sqrt(n);
         BigDecimal start = BigDecimal.valueOf(2);
         
         for (BigDecimal i =start; i.compareTo(end) < 0; i = i.add(BigDecimal.ONE))
 		{
 		   if(n.remainder(i).compareTo(BigDecimal.ZERO)==0)
 		   {
 			   return false;
 		   }
 		}
         
         return true;
		
	}
	
	public static BigDecimal sqrt(BigDecimal value) {
	    BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
	    return x.add(new BigDecimal(value.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
	}
}
