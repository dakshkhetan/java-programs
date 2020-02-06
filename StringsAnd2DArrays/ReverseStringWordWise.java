package StringsAnd2DArrays;

/* **********

	Reverse String Word Wise
	
	Reverse the given string word wise. That is, the last word in given string should 
	come at 1st place, last second word at 2nd place and so on. Individual words should 
	remain as it is.
	
	Sample Input:
	Welcome to Coding Ninjas
	
	Sample Output:
	Ninjas Coding to Welcome

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}
}

************/

public class ReverseStringWordWise {
	  
	public static String reverseWordWise(String str) {
		
      	//finding the reverse of each word in the given string
		String revStr = "";
		String revWord = "";
		int beginIndex = 0;
		for(int i = 0; i < str.length(); i++) {
			revWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = i-1; j >= beginIndex; j--) {
					revWord += str.charAt(j);
				}
				revStr = revStr + revWord + " ";
				beginIndex = i + 1;
			}
		}
		for(int i = str.length() - 1; i >= beginIndex; i--) {
			revWord = revWord + str.charAt(i);
		}
		revStr = revStr + revWord;
		
		//now, printing the reverse of the string containing each word reversed
		String str1 = "";
		for(int i = revStr.length()-1; i >= 0; i--) {
			str1 += revStr.charAt(i);
		}
		return str1;

	}
}
