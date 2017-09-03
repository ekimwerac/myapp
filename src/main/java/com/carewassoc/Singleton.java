package com.carewassoc;

public abstract class Singleton {
	//Create an object
	//private static final Singleton instance = new Singleton();
	private static Singleton instance;

	   //Make the constructor private so that this class cannot be instantiated
	   private Singleton() {}

	   //Get the only object available
	   public static Singleton getInstance() {
		   return instance;
	   }
	}

//Create an object
private static final Singleton instance = new Singleton();

//Make the constructor private so that this class cannot be instantiated
private Singleton(){}

//Get the only object available
public static Singleton getInstance(){
   return instance;
}