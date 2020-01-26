package Fundamentals;

/* **********

	Sum of Even Numbers till N
	
	Given a number N, print sum of all even numbers from 1 to N.
	
	Input Format :
	Integer N
	
	Output Format :
	Required Sum 
	
	Sample Input 1 :
	 6
	
	Sample Output 1 :
	12

************/

import java.util.Scanner;

public class SumOfEvenNumbersTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, sum = 0;
		while (i<=n) {
			if (i%2==0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
