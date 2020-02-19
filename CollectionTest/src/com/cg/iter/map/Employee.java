package com.cg.iter.map;

public class Employee implements  Comparable<Employee>
{
	private int id;
	private String name;
	private long mobile;
	private String designation;
	String delim = System.getProperty("line.separator");
	
	@Override
	public int compareTo(Employee e)
	{
		return id-e.getId();
	}
	@Override
	public int hashCode()
	{
		System.out.println("id: "+id);
		return id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e = (Employee) obj;
		return name.equals(e.getName()) && mobile==e.getMobile() && designation.equals(e.getDesignation());
		// id it is already equal, so no need to compare
	}
	public Employee()
	{
		
	}
	public Employee(int id, String name, long moblie, String designation)
	{
		this.id=id;
		this.name=name;
		this.mobile=moblie;
		this.designation=designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString()
	{
		return delim+"Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", designation=" + designation + "]";
	}

	
	}

