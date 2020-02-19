package com.cg.iter;

public class LambdaTestMain {

	public static void main(String[] args)
	{
		Calculator calc = new Adder();
		System.out.println("Sum: "+calc.calculate(23,32));
		calc = new Subtractor();
		System.out.println("Diff: "+calc.calculate(83,44));
		/*calc = new Calculator()
		{
			
			@Override
			public int calculate(int first, int second)
			{
				return first * second;
			}
		};
		System.out.println("Prod: "+calc.calculate(5, 10));*/
		
		//This can also be written as below
		
		calc = (first, second) -> first * second; //same as the above implementation
		System.out.println("Prod: "+calc.calculate(5, 10));
		calc = (first, second) -> first / second;
		System.out.println("Quotient: "+calc.calculate(10, 5));
	}

}
