package com.cg.iter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args)
	{
		Set<String> colorSet = new HashSet<>();
		String [] colorArray = {"red","blue","green","pink","orange","yellow"};
		
		for(String color : colorArray)
		{
			if(colorSet.add(color)==false)
			{
				System.out.println(color+" is already present");
			}
			
		}
		//colorSet.add(null); TreeSet cannot have null.
		System.out.println(colorSet);
		Set<String> colorSortedSet = new TreeSet<>(colorSet);
		System.out.println(colorSortedSet);
	}

}
