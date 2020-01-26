package Fundamentals;

/* **********

	Celsius to Fahrenheit Table
	
	Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
	you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding 
	Celsius values and print the table.
	
	Input Format :
	3 integers - S, E and W respectively 
	
	Output Format :
	Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value. 
	On Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")
	
	Sample Input :
	0 
	100 
	20
	
	Sample Output :
	0   -17
	20  -6
	40  4
	60  15
	80  26
	100 37

************/

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		
		int F, C;
		for(F=S;F<=E;F+=W) {
			C = (F-32)*5/9;
			System.out.print(F + "\t " + C + "\n");
		}
	}

}
