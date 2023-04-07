package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopProgram {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int N = sc.nextInt();
	int i=1;
	while(i<=N) {
		System.out.print(i+" ");
		i++;
	}

}
}
