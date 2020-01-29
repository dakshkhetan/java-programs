package Fundamentals3;

/* **********

	Number Pattern
	
	Print the following pattern for the given number of rows.
	Pattern for N = 3
	333
	233
	123
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	55555
	45555
	34555
	23455
	12345

************/

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n-i+j);
				//System.out.print(n);
			}
			for(int k=1;k<=n-i;k++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}