package com.cg.iter;

import java.util.Set;
import java.util.TreeSet;

public class EmpTreeSet
{

	public static void main(String[] args)
	{
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(4324,"Sukanya", 9812341234L, "Developer"));
		empSet.add(new Employee(1498,"Ganesh",  9082008234L, "Tester"));
		empSet.add(new Employee(5984,"Amit",    9010041998L, "Manager"));
		empSet.add(new Employee(3124,"Anshuman",9862445156L, "Developer"));
		empSet.add(new Employee(2324,"Ashmita", 9844125764L, "CEO"));
		
//		for (Employee employee : empSet)
//		{
//			System.out.println(employee);
//		}
		System.out.println(empSet);
	}

}
