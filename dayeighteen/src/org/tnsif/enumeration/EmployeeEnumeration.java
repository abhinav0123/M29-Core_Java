package org.tnsif.enumeration;
//program to demonstrate on enumeration
public class EmployeeEnumeration {
	
	enum empType
	{
		//enum constant
		CONTRACT,PERMANENT,PARTTIME
	}
	static void print(empType a)
	{
		if(a==empType.CONTRACT)
		{
			System.out.println("You are on contract based");
		}
		else if(a==empType.PERMANENT)
		{
			System.out.println("You are permanent employee");
		}
		else
			System.out.println("Part-time employee");
	}

	public static void main(String[] args) {
		empType a=empType.PERMANENT;
		print(a);

	}

}