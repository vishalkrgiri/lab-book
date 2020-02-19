package com.cg.iter;

import java.util.Comparator;


public class EmpComparator implements Comparator<Employee>
{

	private String sortField;
	private SortField sortFieldEnum;
	public EmpComparator(SortField sortFieldEnum)
	{
		this.sortFieldEnum=sortFieldEnum;
	}
	public EmpComparator(String sortField)
	{
		this.sortField=sortField;
	}
	@Override
	public int compare(Employee e1, Employee e2)
	{
			if(sortFieldEnum==SortField.NAME)
				return(e1.getName().compareTo(e2.getName()));
			else if(sortFieldEnum==SortField.MOBILE)
				if(e1.getMobile()-e2.getMobile()>0)
					return 1;
			else
				return -1;
			
			return (e1.getId()-e2.getId());
				
	}
	

}
