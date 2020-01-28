package Fundamentals2;

/* **********

	Find character case
	
	Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.
	
	Print
	 1 for uppercase
	 0 for lowercase 
	-1 for any other character (special characters or others)
	
	Input format :
	Single Character
	
	Output format :
	1 or 0 or -1
	
	Sample Input 1 :
	v
	
	Sample Output 1 :
	0
	
	Sample Input 2 :
	V
	
	Sample Output 2 :
	1
	
	Sample Input 3 :
	#
	
	Sample Output 3 :
	-1

************/

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char x = s.nextLine().charAt(0);
		if (x>='A' && x<='Z') {
			System.out.println(1);
		}
		else if (x>='a' && x<='z') {
			System.out.println(0);
		} 
		else {
			System.out.println(-1);
		}

	}

}
