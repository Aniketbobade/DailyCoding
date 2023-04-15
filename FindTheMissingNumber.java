package codes;

import java.util.Scanner;

/*
 Que- https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category[]=Arrays&sortBy=
  
 Given an array of size N-1 such that it only contains distinct integers 
in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber()
that takes array and N as input  parameters and returns the value of the missing number. */

public class FindTheMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int a[] = new int[n - 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int x = missingNum(a, n);
		System.out.println(x);
	}
//main logic
	private static int missingNum(int a[], int n) {
		int sum = (n * (n + 1) / 2);
		for (int i = 0; i < a.length; i++) {
			sum -= a[i];
		}
		return sum;
	}
}