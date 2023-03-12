package codes;

import java.util.Scanner;
import java.util.Stack;

public class MultplyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		find the digit which multiplication is equal to given input
//		e.g 100=4*5*5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value");
		int input= sc.nextInt();
		
		int res=function(input);
		System.out.println(res);
	}

	private static int function(int input) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		if(input<10) {
			return input+10;
		}
		for (int i = 9; i>= 2; i--) {
			while(input%i==0) {
				s.push(i);
				input=input/i;
			}
		}
		if(input!=1) {
			return -1;
		}
		int b=0;
		while(!s.empty()) {
			int x=s.pop();
			b=b*10+x;
		}
		return b;
	}

}
