package Fundamentals3;

/* **********

	Decimal to Binary
	
	Given a decimal number (integer N), convert it into binary and print.
	The binary number should be in the form of an integer.
	
	Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So take the answer as long.
	
	Input format :
	Integer N
	
	Output format :
	Corresponding Binary number (long)
	
	Sample Input 1 :
	12
	
	Sample Output 1 :
	1100
	
	Sample Input 2 :
	7
	
	Sample Output 2 :
	111


************/

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int x;
      	long ans = 0, i = 1;
        while (n > 0) {
        	x = n % 2; 
            ans = ans + (x * i);
            i *= 10;
            n = n / 2; 
        } 
        System.out.println(ans);	
	}
}
