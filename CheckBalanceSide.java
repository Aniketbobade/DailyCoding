package codes;

import java.util.Scanner;

public class CheckBalanceSide {

	public static void main(String[] args) {
		
//		zips zi | ps ==26+9 |16+19 ==35-35= 0 (true)
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.next();
		int len = str.length();
		String substr1 = str.substring(0, len / 2);
		String substr2 = str.substring(len / 2 + len % 2);	
		char[] a = substr1.toCharArray();
		char[] b = substr2.toCharArray();
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 += a[i] - 'a' + 1;
		}
		int sum2 = 0;
		for (int i = 0; i < b.length; i++) {
			sum2 += b[i] - 'a' + 1;
		}
		if((sum1-sum2)==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
