package Recursion1;

/* **********

	Sum of digits (recursive)
	
	Write a recursive function that returns the sum of the digits of a given integer.
	
	Sample Input :
	12345
	
	Sample Output :
	15

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.sumOfDigits(n));
	}
}

************/

public class SumOfDigitsRecursive {

	public static int sumOfDigits(int n){
		
		if(n == 0) {
			return 0;
		}
      
		int smallAns = sumOfDigits(n/10);
		int result = smallAns + (n % 10);
		return result;
      
	}
}
