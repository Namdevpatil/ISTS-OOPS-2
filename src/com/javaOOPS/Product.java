package com.javaOOPS;

public class Product 
{
	
	//fields: part of class
	
	//non-static fields/variables: these variables are not declared with 'static' keyword.
	private int productId;
	private String productName;
	private double productPrice;
	
	//static fields/variables: these variables are declared with 'static' keyword.
	public static String manufacturingFirmName;

	//constructor: to initialize an object(variables/fields)
	public Product() //default constructor: no parameters
	{
		productId = 990;
		productName = "Wifi router";
		productPrice = 3500.55;
	}
	
	public Product(int productId, String productName, double productPrice) //default constructor: no parameters
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	//static block
	static
	{
		manufacturingFirmName = "xyz private limited";
	}
	
	/**
	 * non-static method: these method are not declared with 'static' keyword.
	 * In these methods we can able to access both types of fields(static and non-static)
	 * Note: to access these methods we need to create an object.
	 * ====
	 */
	
	//non-static method
	public String getProductDetails()
	{
		return productId+", "+productName+", "+productPrice+", "+manufacturingFirmName;
	}
	
	/**
	 * static method: these methods are declared with 'static' keyword.
	 * In these methods we can able to access only static fields.
	 * Note: to access these methods we no need to create an object, but we access by class name.
	 * ====
	 */
	
	//static method
	public static String getProductFirmDetails()
	{
		return manufacturingFirmName;
	}
	
	
}
