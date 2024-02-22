package com.javaOOPS;

public class TestClass {

	public static void main(String[] args) 
	{
		
		
		//non-static method
		Product product1 = new Product(101, "xyz", 78.89);
		System.out.println(product1.getProductDetails());
		
		System.out.println("--------------------------------------------------------------------------");
		
		Product product2 = new Product(103, "abc", 88.89);
		System.out.println(product2.getProductDetails());
		
		System.out.println("=========================================================");
		
		//static method
		System.out.println(Product.getProductFirmDetails());

	}

}
