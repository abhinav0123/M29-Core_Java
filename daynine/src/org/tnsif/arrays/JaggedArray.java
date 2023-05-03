package org.tnsif.arrays;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//in jagged array inside array size are different
		int arr[][] = new int[2][];
		//for 1
		arr[0]=new int[3];
		//for 2nd block outside array, we are taking 2 elements
		arr[1]= new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for (int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
