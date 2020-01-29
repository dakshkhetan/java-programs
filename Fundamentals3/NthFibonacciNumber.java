package Fundamentals3;

/* **********

	Nth Fibonacci Number
	
	Nth term of fibonacci series F(n) is calculated using following formula -
	    F(n) = F(n-1) + F(n-2), 
	Provided N you have to find out the Nth Fibonacci Number. Also F(1) = F(2) = 1.
	
	Input Format :
	Integer n
	
	Constraints:
	Time Limit: 1 second
	
	Output Format :
	Nth Fibonacci term i.e. F(n)
	
	Sample Input :
	4
	
	Sample Output :
	3 

************/

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		int t1=1, t2=1, t3=0;
		for(int i=0;i<n-2;i++) {
			t3=t1+t2;
			t1=t2;
			t2=t3;	
		}
		System.out.println(t3);

	}

}
