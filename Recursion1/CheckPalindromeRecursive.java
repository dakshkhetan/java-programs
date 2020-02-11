package Recursion1;

/* **********

	Check Palindrome (recursive)
	
	Check if a given String S is palindrome or not (using recursion). Return true or false.
	
	Input Format :
	String S
	
	Output Format :
	true or false
	
	Sample Input 1 :
	racecar
	
	Sample Output 1:
	true
	
	Sample Input 2 :
	ninja
	
	Sample Output 2:
	false

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}

************/

public class CheckPalindromeRecursive {

	public static boolean isStringPalindrome(String str) {
		
      if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length() - 1)) {
			return isStringPalindrome(str.substring(1, str.length() - 1));
		}
		else {
			return false;
		}

	}
}
