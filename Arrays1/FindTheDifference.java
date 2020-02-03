package Arrays1;

/* **********

	Find the Difference
	
	Given an array/list A with N elements, you need to find difference of sum of elements at 
	even indices (E) and sum of elements at odd indices(O).
	Note : Array/List indexes start from 0.
	
	Input Format :
	  Line 1 : Size of the array/list i.e N
	  Line 2 : N integers i.e. elements of the array/list separated by space
	
	Output Format :
	 Difference i.e. E - O.  
	
	Input Constraints :
	1 <= N <= 10^6
	1 <= Ai <= 10^4
	
	Sample Input :
	5
	1 2 3 4 5
	
	Sample Output :
	3
	
	Sample Output Explanation :
	Sum of elements at even indices = 1 + 3 + 5 = 9
	Sum of elements at odd indices = 2 + 4 = 6
	So output is (9 - 6) i.e. 3.

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		
	
		int[] input = takeInput();
		
		System.out.println(Solution.findDifference(input));
		
	}

}

************/

public class FindTheDifference {

	public static int findDifference(int[] input){
      
      int diff, sumo = 0, sume = 0;
		for(int i=0; i < input.length; i++) {
        	if(i%2==0){
              sume+=input[i];
            }
          	else{
            	sumo+=input[i];
          	}
        }
      	diff = sume - sumo;
      	return diff;

	}
	
}
