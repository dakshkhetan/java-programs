package Recursion1;

/* **********

	Multiplication (Recursive)
	
	Given two integers m & n, calculate and return their multiplication using recursion. 
	You can only use subtraction and addition for your calculation. No other operators are allowed.
	
	Input format : m and n (in different lines)
	
	Sample Input :
	3 
	5
	
	Sample Output :
	15

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(solution.multiplyTwoIntegers(m, n));
	}
}

************/

public class MultiplicationRecursive {

	public static int multiplyTwoIntegers(int x, int y){
	
      if (x == 0 || y == 0) {
			return 0;
		} 

		if (y == 1) {
			return x;
		} 
		else {
			int result = x + multiplyTwoIntegers(x, y - 1);
			return result;
		}
      
	}
}
