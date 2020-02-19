package com.cg.iter;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int is a primitive data type that cannot be used as an identifier. But it's not a keyword.
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print("abcxyz ");
			}
			else if(i%3==0)
			{
				System.out.print("abc ");
			}
			else if(i%5==0)
			{
				System.out.print("xyz ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}
	}

}
