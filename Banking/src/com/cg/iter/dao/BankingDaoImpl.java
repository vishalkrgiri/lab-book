package com.cg.iter.dao;

import org.apache.log4j.Logger;

public class BankingDaoImpl implements BankingDao
{
	private Logger logger = Logger.getLogger(BankingDaoImpl.class);
	private double balance = 1000;
	@Override
	public boolean deposit(double dep_amount)
	{
		logger.info("Deposited amount: "+ dep_amount);
		balance+=dep_amount;
		return true;
	}
	public double getBalance()
	{
		return balance;
	}
	@Override
	public boolean withdraw(double with_amount)
	{
		logger.info("Withdrew amount: "+ with_amount);
		balance-=with_amount;
		return true;
	}
	 
}
