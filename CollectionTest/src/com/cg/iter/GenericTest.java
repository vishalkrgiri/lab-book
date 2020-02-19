package com.cg.iter;

public class GenericTest
{
	public static void main(String[] args)
	{
		GenericTest gt = new GenericTest();
		Integer[] intArr = {1,2,3,4,8,2,1};
		//auto boxing takes care of int to Integer
		gt.printArr(intArr);
		Character [] charArr = {'S','O','A',',','I','T','E','R'};
		gt.printArr(charArr);
		Double [] doubleArr = {1.2,3.5,8.3,1.9};
		gt.printArr(doubleArr);
		int sum=gt.add(1,2,3,4);
		System.out.println(sum);
	}


	 public int add(int ...a)
	{
		int sum=0;
		for(int x: a)
		{
            sum += x;
        }
        return sum;
	}


	private<E> void printArr(E[] eleArr)
	{
		for (E elem : eleArr)
		{
			System.out.print(elem+" ");
		}
		System.out.println();
	}
}