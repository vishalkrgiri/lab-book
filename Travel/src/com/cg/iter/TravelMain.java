package com.cg.iter;

import java.util.Scanner;

public class TravelMain {

	public static void main(String[] args) 
	{
		Car c = new Car(5,5000000,"SUV"); //Car Object
		//c.setTyres(5);
		System.out.println(c);
		/*System.out.println("Car Tyres: "+c.getTyres());
		//c.setCost(500000);
		System.out.println("Car Cost: "+c.getCost());
		c.setType("SUV");
		System.out.println("Car Type: "+c.getType());*/
		
		Bus b = new Bus(10,9000000,"School Bus"); //Bus Object
		System.out.println(b);
		/*b.setTyres(10);
		System.out.println("Bus Tyres: "+b.getTyres());
		b.setCost(9000000);
		System.out.println("Bus Cost: "+b.getCost());
		b.setType("Loader");
		System.out.println("Bus Type: "+b.getType());*/
		//System.out.println(c==b);
		Vehicle v=new Car(5,5000000,"SUV");
		System.out.println(c.equals(v));
		Truck t=new Truck();
		/*c.move();
		b.move();
		t.move();*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of vehicle");
		String type=scan.nextLine();
	
		
		Movable m = MovableFactory.getInstance(type);
		if(m!=null)
			m.move();
		else
			System.out.println(type+" not found");
			//We cannot create object of interface.
	}

}
