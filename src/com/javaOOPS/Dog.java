package com.javaOOPS;

public class Dog 
{
	
	private String dogName;
	
	public Dog() {
		
		System.out.println("Dog name: "+dogName);
		
	}

	public Dog(String dogName)
	{
		this.dogName=dogName;
	}
	
	//instance initializer block
	{
		dogName = "my buddy";
	}
	
	@Override
	public String toString()
	{
		return "Dog [dogName=" + dogName + "]";
	}	
	
}
