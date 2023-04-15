package codes;

import java.util.Scanner;

public class CountBetRang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>r1 && arr[i]<r2) {
				res++;
			}
		}
		System.out.println(res);
	}

}
