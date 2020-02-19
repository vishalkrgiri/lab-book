package com.cg.iter;

public class BoxTest{
	
	public static void main(String[] args)
	{
		Box<Integer> b1 = new Box<>();
		b1.setData(20);
		System.out.println("Box data: "+b1.getData());
		Box<String> b2 = new Box<>();
		b2.setData("ITER");
		System.out.println("Box data: "+b2.getData());
		Box<String> b3 = new Box<>();
		b3.setData("Hello");
		System.out.println("Box data: "+b3.getData());
	}

}
