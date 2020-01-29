package Fundamentals3;

/* **********

	Reverse of a number
	
	Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
	
	Input format :
	Integer N
	
	Constraints:
	Time Limit: 1 second
	
	Output format :
	Corresponding reverse number
	
	Sample Input 1 :
	1234
	
	Sample Output 1 :
	4321
	
	Sample Input 2 :
	1980
	
	Sample Output 2 :
	891

************/

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println(0);
		}
		else {
          int x = n % 10;
			while(x == 0) {
				n = n / 10;
				x = n % 10;
			}
			while(n > 0) {
				System.out.print(n%10);
				n = n / 10;
			}
		}
	}

}
