package Recursion1;

/* **********

	Pair star
	
	Given a string, compute recursively a new string where identical chars that are 
	adjacent in the original string are separated from each other by a "*".
	
	Sample Input 1 :
	hello
	
	Sample Output 1:
	hel*lo
	
	Sample Input 2 :
	xxyy
	
	Sample Output 2:
	x*xy*y
	
	Sample Input 3 :
	aaaa
	
	Sample Output 3:
	a*a*a*a

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.addStars(input));
	}
}

************/

public class PairStar {

	public static String addStars(String str) {
		
      	if(str.equals("") || str.length() == 1) {
			return str;
		}	

		if(str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + addStars(str.substring(1));
		else
			return str.charAt(0) + addStars(str.substring(1));

	}
}
