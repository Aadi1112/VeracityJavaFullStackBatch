package com.polymorphism;

public class Ecommerece {

	

	void applyDiscount(double productPrice) {
		// Normal user
		double discount = productPrice * 0.05;

		double finalPrice = productPrice - discount;

		System.out.println("Final Payment : " + finalPrice);
	}

	void applyDiscount() {
		// Prime User
		double productPrice=2000;
		double discount = productPrice * 0.10;

		double finalPrice = productPrice - discount;

		System.out.println("Final Payment : " + finalPrice);
	}

	void applyDiscount(boolean isDiamondUser) {
		double productPrice=2000;
		double discount = productPrice * 0.15;

		double finalPrice = productPrice - discount;

		System.out.println("Final Payment : " + finalPrice);
		// Diamond User
	}
	
	public static void main(String[] args) {
		
		Ecommerece ee=new Ecommerece();
		
		ee.applyDiscount();
		ee.applyDiscount(true);
		ee.applyDiscount(2000);
	}
}
