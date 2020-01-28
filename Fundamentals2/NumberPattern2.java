package Fundamentals2;

/* **********

	Number Pattern 2
	
	Print the following pattern for the given N number of rows.
	Pattern for N = 4
	1
	11
	202
	3003
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	1
	11
	202
	3003
	40004

************/

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {				//1
		Scanner s = new Scanner(System.in);					//11
		int n = s.nextInt();
		System.out.println(1);
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i-1);
				for(int z=1;z<=i-2;z++) {
					System.out.print("0");
				}
				System.out.print(i-1);
				break;
			}
			System.out.println();
		}
	}
}
