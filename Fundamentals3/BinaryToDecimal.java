package Fundamentals3;

/* **********

	Binary to Decimal
	
	Given a binary number as an integer N, convert it into decimal and print.
	
	Input format :
	An integer N
	
	Output format :
	Corresponding Decimal number (as integer)
	
	Sample Input 1 :
	1100
	
	Sample Output 1 :
	12
	
	Sample Input 2 :
	111
	
	Sample Output 2 :
	7

************/

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int x;
        long ans = 0, i = 0;
        while (n > 0) {
        	x = n % 10; 
            ans = (long) (ans + (x * Math.pow(2, i)));
            i++;
            n = n / 10; 
        } 
        System.out.println(ans);

	}

}
