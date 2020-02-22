package Recursion2;

/* **********

	Print all Codes
	
	Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. 
	Write a program to print the list of all possible codes that can be generated from the given string.
	
	Note : The order of codes are not important. Just print them in different lines.
	
	Input format : A numeric string
	
	Sample Input:
	1123
	
	Sample Output:
	aabc
	kbc
	alc
	aaw
	kw

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		solution.printAllPossibleCodes(input);
	}
}

************/

public class PrintAllCodes {
    
    public static String code(int c) {
		if(c == 1)
			return "a";
		else if(c == 2)
			return "b";
		else if(c == 3)
			return "c";
		else if(c == 4)
			return "d";
		else if(c == 5)
			return "e";
		else if(c == 6)
			return "f";
		else if(c == 7)
			return "g";
		else if(c == 8)
			return "h";
		else if(c == 9)
			return "i";
		else if(c == 10)
			return "j";
		else if(c == 11)
			return "k";
		else if(c == 12)
			return "l";
		else if(c == 13)
			return "m";
		else if(c == 14)
			return "n";
		else if(c == 15)
			return "o";
		else if(c == 16)
			return "p";
		else if(c == 17)
			return "q";
		else if(c == 18)
			return "r";
		else if(c == 19)
			return "s";
		else if(c == 20)
			return "t";
		else if(c == 21)
			return "u";
		else if(c == 22)
			return "v";
		else if(c == 23)
			return "w";
		else if(c == 24)
			return "x";
		else if(c == 25)
			return "y";
		else if(c == 26)
			return "z";
		else
			return "";
	}

	public static void printAllPossibleCodes1(String str, String outputSoFar) {
		
        if(str.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        printAllPossibleCodes1(str.substring(1), outputSoFar + code(str.charAt(0) - 48));
        if(str.length() >= 2){
            int b = (str.charAt(0) - 48) * 10 + str.charAt(1) - 48;
            if(b <= 26) {
                printAllPossibleCodes1(str.substring(2), outputSoFar + code(b));
            }
        }
	}
    
    public static void printAllPossibleCodes(String str){
        printAllPossibleCodes1(str, "");
    }
    
}