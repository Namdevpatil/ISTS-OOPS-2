package com.javaOOPS;

public class Doctor 
{
	
	private String name;
	private String specialization;
	
	//default constructor
	public Doctor() {
		//this("xyz", "ijk");
		name = "abc";
		specialization="asd";
		System.out.println("default");
	}

	//parameterized constructor
	public Doctor(String name, String specialization) {
		this();//default
		this.name = name;
		this.specialization = specialization;
		System.out.println("parameterized");
	}

	@Override
	public String toString() 
	{
		return "Doctor [name=" + name + ", specialization=" + specialization + "]";
	}

}
