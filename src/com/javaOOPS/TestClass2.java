package com.javaOOPS;

public class TestClass2 {

	public static void main(String[] args) 
	{



		//default constructor
		Product product11 = new Product();
		System.out.println(product11.getProductDetails());

		System.out.println("--------------------------------------------------------------------------");

		Product product12 = new Product();
		System.out.println(product12.getProductDetails());
		
		System.out.println("=========================================================");
		
		//parameterized constructor
		Product product1 = new Product(101, "xyz", 78.89);
		System.out.println(product1.getProductDetails());

		System.out.println("--------------------------------------------------------------------------");

		Product product2 = new Product(103, "abc", 88.89);
		System.out.println(product2.getProductDetails());

	}

}
