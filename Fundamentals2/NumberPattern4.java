package Fundamentals2;

/* **********

	Number Pattern 4
	
	Print the following pattern for the given N number of rows.
	Pattern for N = 4
	1234
	123
	12
	1
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	12345
	1234
	123
	12
	1

************/

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) {				//1234
		Scanner s = new Scanner(System.in);					//123
		int n = s.nextInt();								//12
		for(int i=n;i>=1;i--) {								//1
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
