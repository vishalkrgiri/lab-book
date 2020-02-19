package com.cg.iter;

public class StringPoolTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1= "ITER";
		String s2= "ITER";
		System.out.println(s1==s2); //Object belong to String pool.
		String s3= new String("ITER");
		String s4= new String("ITER");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
