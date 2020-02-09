package Recursion1;

/* **********

	Power
	
	Write a program to find x to the power n (i.e. x^n). Take x and n from the user. 
	You need to return the answer.
	Do this recursively.
	
	Input format :
	Two integers x and n (separated by space)
	
	Output Format :
	x^n (i.e. x raise to the power n)
	
	Constraints :
	1 <= x <= 30
	0 <= n <= 30
	
	Sample Input 1 :
	 3 4
	
	Sample Output 1 :
	81
	
	Sample Input 2 :
	 2 5
	
	Sample Output 2 :
	32

************/

/* **********

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(Solution.power(x, n));
	}
}

************/

public class Power {

	public static int power(int x, int n) {
      
		if(n == 0){
			return 1;
		}
		int smallAns = x * power(x, n-1);
        return smallAns;
		
	}
}
