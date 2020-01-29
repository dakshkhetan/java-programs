package Fundamentals3;

/* **********

	Terms of AP
	
	Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
	N varies from 1 to 1000.
	
	Input format :
	Integer x
	
	Output format :
	Terms of series (separated by space)
	
	Sample Input 1 :
	10
	
	Sample Output 1 :
	5 11 14 17 23 26 29 35 38 41
	
	Sample Input 2 :
	4
	
	Sample Output 2 :
	5 11 14 17

************/

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x, count = 0, i = 1;
		while(count < n) {
			x = 3 * i + 2;
			if(x%4 != 0) {
				System.out.print(x + " ");
				count++;
			}
			i++;
		}

	}

}
