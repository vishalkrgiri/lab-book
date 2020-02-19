package com.cg.iter.dao;

public interface BankingDao
{
	boolean deposit(double dep_amount);

	boolean withdraw(double with_amount);
	
	double getBalance();	
}
