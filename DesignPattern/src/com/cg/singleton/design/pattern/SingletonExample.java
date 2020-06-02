package com.cg.singleton.design.pattern;
import java.lang.reflect.Constructor;
public class SingletonExample {
	public static void main(String args[]) 
    { 
		Singleton instanceOne = Singleton.getInstance(); 
		System.out.println(instanceOne.hashCode());
		Singleton x1 = Singleton.getInstance(); 
		System.out.println(x1.hashCode());
		Singleton instanceTwo = null;
		
		   try {
	            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (Singleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	   
    }
}


class Singleton 
{ 
    // static variable single_instance of type Singleton 
    private static Singleton single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
} 