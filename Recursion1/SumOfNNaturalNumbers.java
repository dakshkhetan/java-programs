package Recursion1;

/* **********

	Sum of N Natural Numbers
	
	Given an integer n, find and return the sum of numbers from 1 to n using recursion.
	
	Input Format :
	Integer n
	
	Output Format :
	Sum
	
	Constraints :
	1 <= n <= 10^3
	
	Sample Input :
	10
	
	Sample Output :
	55

************/

/* **********

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		
		System.out.println(Solution.sum(n));
	}
}

************/

public class SumOfNNaturalNumbers {

	public static int sum(int n) {
		
      	if(n == 0){
			return 0;
		}
		int smallAns = n + sum(n - 1);
		return smallAns;
		
	}
}
