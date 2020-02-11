package Recursion1;

/* **********

	Remove X
	
	Given a string, compute recursively a new string where all 'x' chars have been removed.
	
	Sample Input 1 :
	xaxb
	
	Sample Output 1:
	ab
	
	Sample Input 2 :
	abc
	
	Sample Output 2:
	abc
	
	Sample Input 3 :
	xx
	
	Sample Output 3:


************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}

************/

public class RemoveX {

	public static String removeX(String str){
		
      	if(str.length() == 0) {
			return "";
		}
		
		if(str.charAt(0) == 'x') {
			return removeX(str.substring(1)); 
		}
		else {
			String currentCharacter = str.substring(0, 1);
			return currentCharacter + removeX(str.substring(1));
		}
      
	}
}
