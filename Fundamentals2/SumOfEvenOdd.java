package Fundamentals2;

/* **********

	Sum of even & odd
	
	Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
	Digits means numbers not the places. That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
	
	Input format :
	 Integer N
	
	Output format :
	Sum_of_Even_Digits Sum_of_Odd_Digits
	(Print first even sum and then odd sum separated by space)
	
	Sample Input :
	1234
	
	Sample Output :
	6 4

************/

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, sume = 0, sumo = 0;
		while(n > 0) {
			i = n % 10;
			if(i % 2 == 0) {
				sume += i;
			}
			else {
				sumo += i;
			}
			n = n / 10;
		}
		System.out.println(sume + " " + sumo);
	}

}