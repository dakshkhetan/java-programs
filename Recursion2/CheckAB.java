package Recursion2;

/* **********

	Check AB
	
	Suppose you have a string made up of only 'a' and 'b'. Write a recursive function 
	that checks if the string was generated using the following rules:
	a. The string begins with an 'a'
	b. Each 'a' is followed by nothing or an 'a' or "bb"
	c. Each "bb" is followed by nothing or an 'a'
	If all the rules are followed by the given string, return true otherwise return false.
	
	Sample Input:
	abb
	
	Sample Output:
	true

************/

/* **********

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(Solution.checkAB(input));
	}

}

************/

public class CheckAB {

	public static boolean checkAB(String str) {
		
        if(str.length() == 0) {
			return true;
		}

		if (str.charAt(0) != 'a') {
			return false;
		}

		if (str.length() >= 3 && str.substring(0,3).equals("abb")) {
			return checkAB(str.substring(3));	
		} 
		else {
			return checkAB(str.substring(1));
		}

	}
}
