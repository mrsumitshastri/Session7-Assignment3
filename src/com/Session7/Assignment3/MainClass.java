package com.Session7.Assignment3;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Main Objective : Handle NullPointer Exception. It will occur whenever a member is invoked with a null object
		 * 
		 * Program description :
		 * 		Defining an interface and its implementation in two different classes in different way. Define an
				interface having one method that takes an integer parameter. For this method, provide two
				implementations: In the first one, just print the value and in the second one, print the square of the
				number. Try to call both the versions.
				
			Condition when error occur
				if we enter more than 2 or less than 1 than NullPointerException exception will be generate
		 */
		ExampleInterface example = null  ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you choice \nFor Printing value : 1 \nFor Printing Square of value : 2");
		System.out.println("******************************");
		switch (scan.nextInt()) {
		case 1:
			example = new classForPrintingValue(10);
			break;
		case 2:
			example = new classForPrintingSquare(10);
			
			break;

		default:
			System.out.println("Wrong input");
			break;
		}
		
		try {
			example.print();
		} catch (NullPointerException e) {
			System.out.println("'example' object has not refrance of ExampleInterface interface. Please create an object of this interface");
		}
	}
}
 interface ExampleInterface {

	public void print();
}

class base 
{
	protected int number;
}
class classForPrintingValue extends base implements ExampleInterface
{
	public classForPrintingValue(int number)
	{
		this.number = number;
	}
	public void print() {
		System.out.println(" value is :"+ this.number);
	}
	
}

class classForPrintingSquare extends base implements ExampleInterface
{

	public classForPrintingSquare(int number)
	{
		this.number = number;
	}
	public void print() {
		System.out.println("Square of the value is "+ this.number*this.number);
		
	}
	
}

