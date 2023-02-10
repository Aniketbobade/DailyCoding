package codes;

import java.util.Scanner;

/*
Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance.

Explanation:

1st hour:
Entry : 7 Exit: 1
No. of guests on ship : 6

2nd hour :
Entry : 0 Exit : 2
No. of guests on ship : 6-2=4

Hour 3:
Entry: 5 Exit: 1
No. of guests on ship : 4+5-1=8

Hour 4:
Entry : 1 Exit : 3
No. of guests on ship : 8+1-3=6

Hour 5:
Entry : 3 Exit: 4
No. of guests on ship: 6+3-4=5
Hence, the maximum number of guests within 5 hours is 8. */

public class MaximumNumberOfGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Time");
		int t=sc.nextInt();
		
		int E[]=new int[t];
		int L[]=new int[t];
		
		for (int i = 0; i < E.length; i++) {
			E[i]=sc.nextInt();
		}
		for (int i = 0; i < L.length; i++) {
			L[i]=sc.nextInt();
		}
		int sum=0;
		int max=0;
		for (int i = 0; i < t; i++) {
			sum+=E[i]-L[i];
			max=Math.max(max, sum);
		}
		System.out.println(max);
		
	}

}
