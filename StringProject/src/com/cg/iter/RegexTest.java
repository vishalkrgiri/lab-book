package com.cg.iter;

import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 digit number");
		String input=scan.nextLine();
		boolean valid = input.matches("\\d{5}");
		if(valid)
			System.out.println("It's a 5 digit number");
		else
			System.out.println("Not a 5 digit number");
		//System.out.println(valid);
		
	}

}
