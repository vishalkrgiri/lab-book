package com.cg.iter.service;

import java.util.Scanner;

public interface BankingService
{
	boolean deposit(double dep_amount);

	boolean withdraw(double with_amount);
	
	double getBalance();
}
