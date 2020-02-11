package Recursion1;

/* **********

	Replace pi (recursive)
	
	Given a string, compute recursively a new string where all appearances of "pi" 
	have been replaced by "3.14".
	
	Sample Input 1 :
	xpix
	
	Sample Output :
	x3.14x
	
	Sample Input 2 :
	pipi
	
	Sample Output :
	3.143.14
	
	Sample Input 3 :
	pip
	
	Sample Output :
	3.14p

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}

************/

public class ReplacePiRecursive {

	public static String replace(String str){
		
      	if (str.length() < 2) {
			return str;
		}
		
		if(str.substring(0, 2).equals("pi")) {
			return "3.14" + replace(str.substring(2));
		}
		else {
			String currentCharacter = str.substring(0, 1);
			return currentCharacter + replace(str.substring(1));
		}

	}
}
