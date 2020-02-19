package com.cg.iter;

public class StringTest {

	public StringTest()
	{
		String str="Hello"; //String Literal
		modify(str);
		System.out.println("After Modify: "+str);
		StringBuilder sb = new StringBuilder("Hello");
		modify(sb);
		System.out.println("sb: "+sb);
	}

	private void modify(StringBuilder sb) 
	{
		sb.append(" guys");
	}

	private void modify(String str)
	{
		//str=str+" guys";
		str = str.concat(" guys");
		System.out.println("Inside Modify: "+str);
	}
	
	public static void main(String[] args) 
	{
		new StringTest();
	}
}
