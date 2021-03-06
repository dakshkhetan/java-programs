package Arrays1;

/* **********

	Arrange Numbers in Array
	
	Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
	Input Format :
	 Integer n
	Output Format :
	 Elements of the array separated by space.
	Sample Input 1 :
	6
	Sample Output 1 :
	 1 3 5 6 4 2
	Sample Input 2 :
	9
	Sample Output 2 :
	 1 3 5 7 9 8 6 4 2

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = Solution.arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}		
	}

}


************/

public class ArrangeNumbersInArray {

	public static int[] arrange(int n){
		
		int[] arr = new int[n];
		int i, val=1;
      	int s=0, e=n-1;

		for(i=0;i<=n/2;i++) {
			arr[s]=val;
			val++;
          	if(s==n/2) {
				return arr;
			}
			arr[e]=val;
			val++;
          	if(e==n/2) {
				return arr;
			}
			s++;
			e--;
		}		
		return arr;

	}
	
}