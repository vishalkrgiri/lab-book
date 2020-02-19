package com.cg.iter;

import java.util.Scanner;

public class MobileCheck {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String input = scan.nextLine();
		boolean valid = input.matches("[6-9][0-9]{9}");
		System.out.println(valid);
	}

}
