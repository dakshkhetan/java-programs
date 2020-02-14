package Recursion1;

/* **********

	String to Integer
	
	Write a recursive function to convert a given string into the number it represents. 
	That is input will be a numeric string that contains only numbers, you need to convert 
	the string into corresponding integer and return the answer.
	
	Input format :
	Numeric string (string, Eg. "1234")
	
	Output format :
	Corresponding integer (int, Eg. 1234)
	
	Sample Input 1 :
	1231
	
	Sample Output 1:
	1231
	
	Sample Input 2 :
	12567
	
	Sample Output 2 :
	12567

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.convertStringToInt(input));
	}
}

************/

public class StringToInteger {

	public static int convertStringToInt(String str){
		
      if(str.length() == 0)
			return 0;
	    
	    char c = str.charAt(0);
	    String ros = str.substring(1);

	    int factor = 1;
	    for(int i = 0; i < str.length() - 1; i++)
	        factor *= 10;

        //'0' has ASCII value of 48
	    factor = factor * (c - '0');
	    return factor + convertStringToInt(ros);

	}
}