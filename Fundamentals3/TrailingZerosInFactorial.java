package Fundamentals3;

/* **********

	Trailing Zeros in Factorial
	
	Given an integer n, find the number of trailing 0s in its factorial. Do this without actually finding the n!, as the integer given can be large and its factorial can exceed the integer limits.
	
	Input format :
	Integer n  
	
	Output Format :
	Count of trailing 0s
	
	Constraints :
	1 <= n <= 10^11
	
	Sample Input
	50
	
	Sample Output
	12   

************/

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		int count = 0; 
		// basically we've to find total number of 5s here
		// keep dividing n by powers of 5 and update count 
		for (int i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}
		System.out.println(count);
	}

}
