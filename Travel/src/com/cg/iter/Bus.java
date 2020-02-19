package com.cg.iter;

public class Bus extends Vehicle implements Movable
{

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int tyres, double cost, String type)
	{
		
		super(tyres,cost,type);
		//super(tires, cost, type);
		// TODO Auto-generated constructor stub
		/*System.out.println("Bus Tires: "+tires);
		System.out.println("Bus Cost: "+cost);
		System.out.println("Bus Types: "+type);*/
	}

	@Override
	public String toString() {
		return "Bus " + super.toString();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus is moving");
	}
	
}
