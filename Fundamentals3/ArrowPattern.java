package Fundamentals3;

/* **********

	Arrow Pattern
	
	Print the following pattern for the given number of rows.
	Assume N is always odd.
	Note : There is space after every star.
	Pattern for N = 7
	*
	 * *
	   * * *
	     * * * *
	   * * *
	 * *
	*
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	11
	
	Sample Output :
	*
	 * *
	   * * *
	     * * * *
	       * * * * *
	         * * * * * *
	       * * * * *
	     * * * *
	   * * *
	 * *
	*

************/

import java.util.Scanner;

public class ArrowPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		for(int i=1; i<=n/2+1 ;i++) {
			for(int z=0; z<i-1; z++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n/2; i>=0; i--) {
			for(int z=0; z<i-1; z++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
