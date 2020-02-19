package com.cg.iter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest 
{
	
	public ExceptionTest()
	{
		Scanner scan = new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator = scan.nextInt();
		System.out.println("Enter Denominator");
		int denominator = scan.nextInt();
		
		int quotient=divide(numerator,denominator);
		System.out.println("Result: "+quotient);
		System.out.println();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator cannot be zero");
			System.out.println();
		}
		catch (InputMismatchException e)
		{
			// TODO: handle exception
			System.out.println("Please enter number only");
			System.out.println();
		}
		finally
		{
			System.out.println("End of program...");
		}
	}
	private int divide(int numerator, int denominator) 
	{
		int result=numerator/denominator;
		
		return result;
		
	}
	public static void main(String[] args) 
	{
		new ExceptionTest();
	}
}