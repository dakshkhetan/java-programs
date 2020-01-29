package Fundamentals3;

/* **********

	All Prime Numbers
	
	Given an integer N, print all the prime numbers that lies in between 2 to N (both inclusive).
	Print the prime numbers in different lines.
	
	Input Format :
	Integer N
	
	Output Format :
	Prime number in different lines
	
	Constraints :
	1 <= N <= 100
	
	Sample Input :
	9
	
	Sample Output :
	2
	3
	5
	7

************/

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int x = s.nextInt();  
		int i,n,flag;
		for(n=2;n<=x;n++) {
		    flag=0;
			for(i=2;i<=n/2;i++) {
				if(n%i==0){      
					flag=1;       
				}
			}
			if(flag==0) {
				System.out.println(n);
			}
			
		}      
	}

}
