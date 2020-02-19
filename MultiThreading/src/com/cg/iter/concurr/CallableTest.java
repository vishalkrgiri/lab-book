package com.cg.iter.concurr;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	public static void main(String[] args) {
		System.out.println(new Date());
		Callable<String> call1 = new MyCallable(1);
		Callable<String> call2 = new MyCallable(2);
		ExecutorService es = Executors.newFixedThreadPool(2);
		// Callable returns a Future object after completion of task
		Future<String> future1 = es.submit(call1);
		Future<String> future2 = es.submit(call2);
		for (int i = 0; i < 10; i++) {
			System.out.print(" [main] ");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
			}
		}
		String result;
		try {
			System.out.println("\nwaiting 1");
			result = future1.get();
			System.out.println("future1 : " + result);
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("waiting 2");
			result = future2.get();
			System.out.println("future2 : " + result);
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
		System.out.print(" shutting down jobs");
		es.shutdown();
	}
}