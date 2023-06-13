package org.tnsif.enumeration;
//program to demonstrate on enumeration
public class EnumerationProgram {
	
	enum Margin
	{
		//enum constants
		TOP,BOTTOM,LEFT,RIGHT
	}

	public static void main(String[] args) {
		int count=10;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin:%d=%s\n" ,count++,m);
		}

	}

}