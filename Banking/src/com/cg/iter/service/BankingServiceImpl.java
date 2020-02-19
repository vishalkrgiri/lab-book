package com.cg.iter.service;

import com.cg.iter.dao.BankingDao;

import com.cg.iter.dao.BankingDaoImpl;
import com.cg.iter.dao.BankingDaoImplFile;

public class BankingServiceImpl implements BankingService
{

	private BankingDao bDao; //Data Access Object
	
	public BankingServiceImpl()
	{
		bDao = new BankingDaoImpl();
		//new BankingDaoImplFile();
	}
	
	@Override
	public boolean deposit(double dep_amount)
	{
		return bDao.deposit(dep_amount);
	}

	@Override
	public double getBalance()
	{
		return bDao.getBalance();
	}

	@Override
	public boolean withdraw(double with_amount)
	{
		return bDao.withdraw(with_amount);
	}
	
}
