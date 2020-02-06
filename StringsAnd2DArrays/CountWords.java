package StringsAnd2DArrays;

/* **********

	Count Words
	
	Given a string S, count number of words in the string.
	Note : Assume there is single space between two words and there are no extra spaces before and after words.
	Input Format :
	 String S
	Output Format :
	Count of words
	Sample Input :
	this is a sample string
	Sample Output :
	5

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(Solution.countWords(str));
	}

}

************/

public class CountWords {

	public static int countWords(String str){
	
      	int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count+1;

	}

}
