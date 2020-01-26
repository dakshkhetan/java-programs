package Fundamentals;

/* **********

	Number Pattern 2
	
	Print the following pattern
	Pattern for N = 4
	       1
	     23
	   345
	 4567
	
	Input Format :
	N (Total no. of rows)
	
	Output Format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	          1
	        23
	      345
	    4567
	  56789

************/

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {				//    1
		Scanner s = new Scanner(System.in);					//   23
		int n = s.nextInt();								//  345
		int row = 1;										// 4567				
		while (row<=n) {									//56789
			int sp = 1;
			while (sp <= n-row) {
				System.out.print(" ");
				sp++;
			}
			int val =row;
			int count = 1;
			while (count <= row) {
				System.out.print(val);
				val++;
				count++;			
			}
			System.out.println("\n");
			row++;
		}
	}
}