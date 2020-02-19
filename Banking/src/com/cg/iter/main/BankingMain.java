package com.cg.iter.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.iter.service.BankingService;
import com.cg.iter.service.BankingServiceImpl;

public class BankingMain
{
		private BankingService bService;
		public BankingMain(BankingService bService) {
		Scanner scan = new Scanner(System.in);
		this.bService=bService;
		int choice=0;

		while(true)
		{
			//infinite loop
			System.out.println("Welcome To Banking System");
			choice = getChoice(scan);
			
			switch (choice)
			{
			case 1:
				boolean inCorrect=true;
				do {
				//System.out.println("Deposit Amount");
				System.out.println("Enter Amount to be deposited");
				try {
				double dep_amount=scan.nextDouble();
				if(dep_amount<=0)
				{
					System.out.println("Amount cannot be zero or negative");
				}
				else
				{
					inCorrect=false;
					boolean success = bService.deposit(dep_amount);
					if(success)
					{
						System.out.println("Amount Deposited Successfully");
					}
					else
					{
						System.out.println("Could Not Deposit Amount");
					}
				}
				//System.out.println("Amount: "+amount);
				}
				catch (InputMismatchException e)
				{
					System.out.println("Amount should be number");
					scan.nextLine();
				}
				}
				while(inCorrect);
				break;
				
			case 2:
				boolean isCorrect=true;
				do {
				//System.out.println("Withdraw Amount");
				System.out.println("Enter Amount to be withdrawn");
				try {
				double with_amount=scan.nextDouble();
				if(with_amount<=0)
				{
					System.out.println("Amount cannot be zero or negative");
				}
				else
				{
					double balance=bService.getBalance();
					if(with_amount<=balance-1000)
					{
						isCorrect=false;
						boolean success = bService.withdraw(with_amount);
						if(success)
						{
							System.out.println("Amount Withdrawn Successfully");
						}
						else
						{
							System.out.println("Could Not Withdraw Amount");
						}
					}
					else
					{
						System.out.println("Not sufficient balance");
					}
				}
				//System.out.println("Amount: "+amount);
				}
				catch (InputMismatchException e)
				{
					System.out.println("Amount should be number");
					scan.nextLine();
				}
				}
				while(isCorrect);
				break;
				
			case 3:
				System.out.println("Available Balance");
				double balance = bService.getBalance();
				System.out.println("Balance: "+balance);
				break;
				
			case 4:
				System.out.println("Exiting System... Thank You!");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter 1 to 4 only");
				break;
			}
		}		
	}
	
	private int getChoice(Scanner scan)
	{
		int choice=0;
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit System");
		System.out.println("Enter your choice");
		
		try
		{
			choice=scan.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter valid input");
			scan.nextLine();// Consume the keyboard value.
		}
		return choice;
	}

	public static void main(String[] args)
	{
		BankingService bService = new BankingServiceImpl();
		BankingMain bm = new BankingMain(bService);
	}
}
