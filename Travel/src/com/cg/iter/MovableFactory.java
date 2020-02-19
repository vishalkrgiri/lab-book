package com.cg.iter;

public class MovableFactory {

	public static Movable getInstance(String type)
	{
		int age=18;
		Movable m = null;
		if("car".equalsIgnoreCase(type))
		{
			m=new Car();
		}
		else if("bus".equalsIgnoreCase(type))
		{
			m=new Bus();
		}
		else if("truck".equalsIgnoreCase(type))
		{
			m=new Truck();
		}
		else
		{
			//m = new UnknownVehicle();
			//local, inner, anonymous class
			m = new Movable() {

				@Override
				public void move()
				{
					System.out.println("Anonymous vehicle is moving..");
				}}; // This is actually a class i.e sub-classing it. A class without name is called Anonymous class
		}
//		switch (type) 
//		{
//		case "Car":
//			m=new Car();
//			break;
//			
//		case "Bus":
//			m=new Bus();
//			break;
//			
//		case "Truck":
//			m=new Truck();
//			break;
//		case "car":
//			m=new Car();
//			break;
//			
//		case "bus":
//			m=new Bus();
//			break;
//			
//		case "truck":
//			m=new Truck();
//			break;
//
//		default:
//			
//			break;
//		}
		return m;
	}
	private static class UnknownVehicle implements Movable
	{

		@Override
		public void move()
		{
			System.out.println("Unknown Vehicle is moving..");
		}
		
	}
}
