package com.javaOOPS;

public class ProductOfNumbers 
{
	private int value1;
	private int value2;
	
	public ProductOfNumbers() {
		
		System.out.println("--------------task ended-------------");
		System.out.println("Product: "+value1*value2);
		
	}
	
	//instance initializer block
	{
		System.out.println("--------------task started-------------");
		value1 = 60;
		value2 = 50;
	}
	
}
