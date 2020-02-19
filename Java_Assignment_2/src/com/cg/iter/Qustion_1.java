package com.cg.iter;
/**
 * THIS CLASS WILL DISPLAY THE NUMBER FROM 1 TO 50 BUT
 * IF NUMBER IS DIVISIBLE BY 3 THEN IT WILL PRINT "ABC"
 * AND IF NUMBER IS DIVISIBLE BY 5 THEN IT WILL PRINT "XYZ"
 * AND IF BOTH THEN IT WILL PRINT "ABCXYZ"
 * ELSE THE NUMBER ITSELF.
 * @author Administrator
 *
 */
public class Qustion_1 {

	/**
	 * This will return the result.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] intArr = new int[50];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=i+1;
		}
		
		for(int i=0;i<intArr.length;i++)
		{
			if(intArr[i]%3==0 && intArr[i]%5==0)
			{
				System.out.print("abcxyz ");
			}
			else if(intArr[i]%5==0)
			{
				System.out.print("xyz ");
			}
			else if(intArr[i]%3==0)
			{
				System.out.print("abc ");
			}
			else
			{
				System.out.print(intArr[i]+" ");
			}
		}
	}

}
