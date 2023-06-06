package org.tnsif.generics;

class GenericMethod{
	public <E> void print(E[] arr1) {
		for(E itr:arr1) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodExample {

	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		Integer[] arr1= {1,2,3,4};
		Character[] arr2 = {'f','k','z'};
		System.out.println("Integer array: ");
		g.print(arr1);
		System.out.println("Character array: ");
		g.print(arr2);
	}

}
