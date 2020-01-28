package Fundamentals2;

/* **********

	Roots of quadratic equation
	
	Write a program to calculate the roots of a given quadratic equation -
	      a(x^2) + bx + c = 0 
	
	Print roots specifying their nature. If roots are imaginary, no need to print the roots.
	
	Print the nature of roots in the form of an integer -
	 0 : if roots are real & same
	 1 : if roots are real & different
	-1 : if roots are imaginary
	
	Round off the roots and then print the integral part only i.e. without any decimal places.
	You can assume that, input will always be a quadratic equation.
	
	Input format :
	a b c (separated by space)
	
	Output format :
	Line 1 : Nature of roots (0 or 1 or -1)
	Line 2 : Root 1 and Root 2 (separated by space)
	
	Sample Input 1 :
	1 4 2
	
	Sample Output 1 :
	1
	-1 -3
	
	Sample Input 2 :
	1 2 3
	
	Sample Output 2 :
	-1

************/

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = b*b-4*a*c;
		if(d>0) {
			System.out.println(1);
			double x = (-b+Math.pow(d, 0.5))/(2*a);
			double y = (-b-Math.pow(d, 0.5))/(2*a);
			long x1 = Math.round(x);
			long y1 = Math.round(y);
			System.out.println(x1 + " " + y1);
		}
		else if (d==0) {
			System.out.println(0);
			double x = -b/(2.0*a);
			long x1 = Math.round(x);
			System.out.println(x1 + " " + x1);	
		}
		else {
			System.out.println(-1);
		}
		
	}
}
