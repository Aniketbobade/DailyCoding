package codes;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr number");
		int input=sc.nextInt();
		int temp=input;
		int res=0;
		while(temp!=0) {
			int a=temp%10;
			res=res+(int)(Math.pow(a, 3));
			temp=temp/10;
		}
		if(res==input) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
