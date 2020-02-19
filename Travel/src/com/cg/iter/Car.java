package com.cg.iter;
/**
 * 
 * @author Administrator
 *This Car class inherits from Vehicle
 */
public class Car extends Vehicle implements Movable
{

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int tyres, double cost, String type) {
		super(tyres, cost, type);
		// TODO Auto-generated constructor stub
		/*System.out.println("Car Tyres: "+tyres);
		System.out.println("Car Cost: "+cost);
		System.out.println("Car Types: "+type);*/
	}

	@Override
	public String toString() {
		return "Car " + super.toString();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving");
	}
	
}
