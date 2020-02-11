package Recursion1;

/* **********

	Count Zeros
	
	Given an integer n, count and return the number of zeros that are present in the 
	given integer using recursion.
	
	Input Format :
	Integer n
	
	Output Format :
	No. of 0s
	
	Sample Input :
	10204
	
	Sample Output
	2

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.countZerosRec(n));
	}
}

************/

public class CountZeros {

	public static int countZerosRec(int n){
      
		if(n == 0) {
			return 0;
		}
		
		int smallAns = countZerosRec(n / 10);
		if(n%10 == 0) {
			int result = 1 + smallAns;
			return result;
		}
      	else
			return smallAns;
	}
}