package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class EmpListTest{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4324,"Sukanya", 9812341234L, "Developer"));
		empList.add(new Employee(1498,"Ganesh",  9082008234L, "Tester"));
		empList.add(new Employee(5984,"Amit",    9010041998L, "Manager"));
		empList.add(new Employee(4124,"Anshuman",9862445156L, "Developer"));
		empList.add(new Employee(2324,"Ashmita", 9844125764L, "CEO"));
		
		//System.out.println(empList);
		System.out.println("Sorted by ID: ");
		//Collections.sort(empList, new EmpComparator(SortField.ID));
		Collections.sort(empList, (e1,e2) -> e1.getId()-e2.getId());
		System.out.println(empList);
		System.out.println();
		System.out.println("Sorted by Name: ");
		Collections.sort(empList, new EmpComparator(SortField.NAME));
		System.out.println(empList);
		System.out.println();
		System.out.println("Sorted by Mobile: ");
		Collections.sort(empList, new EmpComparator(SortField.MOBILE));
		//System.out.println(empList);
		empList.stream().forEach(System.out::print);
		System.out.println();
		empList.stream().filter(e->e.getDesignation().equals("Developer")).forEach(System.out::print);
		System.out.println();
		empList.hashCode();
		System.out.println(empList);
	}
}
