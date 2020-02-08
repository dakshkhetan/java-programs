package StringsAnd2DArrays;

/* **********

	Compress the String
	
	Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
	For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
	Note : Consecutive count of every character in input string is less than equal to 9.
	
	Input Format :
	Input string S
	
	Output Format :
	Compressed string 
	
	Sample Input:
	aaabbccdsa
	
	Sample Output:
	a3b2c2dsa

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.compress(input));
	}
}

************/

public class CompressTheString {

	public static String compress(String str) {
		
      	int count = 1;		//initializing count as 1 as a character will be present atleast once
		String str1 = "";
		str1 += str.charAt(0); 
		str += " ";			//adding space at the end of given string so as 
							//to give output corresponding last letter

		for (int i = 1; i < str.length() ; i++) { 
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else {
				if(count != 1) {
					str1 += count;
					str1 += str.charAt(i);
					count = 1;
				}
				else {
					str1 += str.charAt(i);
					count = 1;
				}
			}
		} 
		return str1;
	}

}