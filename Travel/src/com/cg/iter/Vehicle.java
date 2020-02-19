package com.cg.iter;

/**
 * This is the permanent class for all vehicle.
 * @author Administrator
 *
 */

public abstract class Vehicle 
{
	private int tyres;
	private double cost;
	private String type;
	
	
	
	@Override
	public boolean equals(Object obj) {
		Vehicle compared=(Vehicle)obj;
		return tyres==compared.getTyres() && cost==compared.getCost() && type.equals(compared.getType());
	}

	public Vehicle() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int tyres, double cost, String type) 
	{
		//super();
		this.tyres=tyres;
		this.cost=cost;
		this.type=type;
	}

	@Override
	public String toString() {
		return "Vehicle [tyres=" + tyres + ", cost=" + cost + ", type=" + type + "]";
	}
	
	/**
	 * 
	 * @return The number returns the number of tyres Car has.
	 */
	public int getTyres() {
		return tyres;
	}
//	public void setTyres(int tyres) {
//		this.tyres = tyres;
//	}
	public double getCost() {
		return cost;
	}
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
	public String getType() {
		return type;
	}
//	public void setType(String type) {
//		this.type = type;
//	}
	
}
