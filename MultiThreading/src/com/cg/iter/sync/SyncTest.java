package com.cg.iter.sync;

public class SyncTest
{
	public static void main(String[] args)
	{
		SharedInterface so = new SharedObject();
		Runnable prod = new Producer(so);
		Runnable cons = new Consumer(so);
		new Thread(prod).start();
		try
		{
			Thread.sleep(2);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		new Thread(cons).start();
	}
}