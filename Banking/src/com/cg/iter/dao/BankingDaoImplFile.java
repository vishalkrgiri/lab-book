package com.cg.iter.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.cg.iter.service.BankingService;

public class BankingDaoImplFile implements BankingDao{

	private double minBalance;
	private String configFile="bank.config";
	private String balanceFile="balance.config";
	private BufferedReader reader;
	private BufferedWriter writer;
	
	
	public BankingDaoImplFile()
	{
		try
		{
			reader = new BufferedReader(new FileReader(balanceFile));
			writer = new BufferedWriter(new FileWriter(balanceFile,true));
			BufferedReader br = new BufferedReader(new FileReader(configFile));
			String[] bal = br.readLine().split("=");
			minBalance = Double.parseDouble(bal[1]);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean deposit(double dep_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(double with_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBalance()
	{
		
		try
		{
			String line = reader.readLine();
			System.out.println("Line: "+line);
			String[] bal = line.split("=");
			bal = reader.readLine().split("=");
			return Double.parseDouble(bal[1]);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

}
