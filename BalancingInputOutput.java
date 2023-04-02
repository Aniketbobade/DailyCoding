package codes;

import java.util.Iterator;
import java.util.Scanner;

public class BalancingInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int input,output, error;
		
		input =sc.nextInt();
		output=sc.nextInt();
		error=sc.nextInt();
		
		int inputArray[]=new int[input];
		int outArray[]=new int[output];
		
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=sc.nextInt();
		}
		for (int i = 0; i < outArray.length; i++) {
			outArray[i]=sc.nextInt();
		}
		int sum1=0;
		
		int sum2=0;
		for (int i = 0; i < inputArray.length; i++) {
			sum1=sum1+(inputArray[i]-error);
			
		}
		for (int i = 0; i < outArray.length; i++) {
			sum2=sum2+(outArray[i]-error);
		}
		
		
		if(sum1>sum2) {
			System.out.println(sum1-sum2+error);
		}else if (sum1<sum2) {
			System.out.println(sum2-sum1+error);
		}else {
			System.out.println("balance");
		}

	}

}
