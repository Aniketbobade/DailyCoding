package codes;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Binary Number");
		int binary=sc.nextInt();
		int res=0;
		int n=0;
		while(binary!=0) {
			int temp=binary%10;
			res=(int) (res+temp* Math.pow(2,n));
			binary=binary/10;
			n++;
		}
		System.out.println(res);
		
	}

}
