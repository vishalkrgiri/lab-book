package com.cg.iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ListTest
{

	public static void main(String[] args)
	{
		List<String> colorList = new ArrayList<>(); //because we can add object, 
		             //we need to tell compiler which type is being
					//added. This is called Generic capability
					//This provides compile time safety
					//Later no one can add other types by mistake
		String[] colorArray = {"red","blue","green","pink","orange"};
		for (String color : colorArray)
		{
			//for each color of String type in colorArray
			colorList.add(color);
		}
		System.out.println(colorList);
		colorList.add(1,"yellow");
		System.out.println(colorList);
		Collections.sort(colorList);
		colorList.remove(3);
		System.out.println(colorList);
		String[] deleteArray = {"blue","pink","red"};
		List<String> deleteList = Arrays.asList(deleteArray);
		//System.out.println(deleteList.getClass().getName());
		Iterator<String> iter = colorList.iterator();
		while (iter.hasNext())
		{
			String color = iter.next();
			if(deleteList.contains(color))
			{
				iter.remove();
				
			}
		}
		System.out.println(colorList);
		
	}

}
