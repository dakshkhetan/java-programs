package Fundamentals;

/* **********

	Triangle of Numbers
	
	Print the following pattern for the given number of rows.
	Pattern for N = 3
	       1
	     232
	   34543
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	           1
	         232
	       34543
	     4567654
	   567898765

************/

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {				//    1
		Scanner s = new Scanner(System.in);					//   232
		int n = s.nextInt();								//  34543

        for(int i = 1; i <= n; i++) {
        	for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
        	int val = i;
        	for(int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }
        	int val1 = 2*i-2;
        	for(int k = 1; k <= i-1; k++) {
                System.out.print(val1);
                val1--;
                
            }
        	System.out.println();
        }
	}
}