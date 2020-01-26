package Fundamentals;

/* **********

	Star Pattern
	
	Print the following pattern
	Pattern for N = 4
	    *
	   *** 
	  *****
	 *******
	
	Input Format :
	N (Total no. of rows)
	
	Output Format :
	Pattern in N lines
	
	Sample Input 1 :
	3
	
	Sample Output 1 :
	   *
	  *** 
	 *****

************/

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			int k = 0;
			while(k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}

			System.out.println();
		}   
	}

}
