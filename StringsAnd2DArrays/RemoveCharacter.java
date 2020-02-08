package StringsAnd2DArrays;

/* **********

	Remove character
	
	Given a string and a character x. Write a function to remove all occurrences of x character from the given string.
	Leave the string as it is, if the given character is not present in the string.
	Input format :
	
	Line 1 : Input string
	
	Line 2 : Character x
	
	Sample Input :
	welcome to coding ninjas
	o
	Sample Output :
	welcme t cding ninjas

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(solution.removeAllOccurrencesOfChar(input, c));
	}
}

************/

public class RemoveCharacter {

	public static String removeAllOccurrencesOfChar(String str, char c) {
	   
      	String temp = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != c) {
				temp += str.charAt(i);
			}
		}
		
		return temp;

	}

}
