package codes;

import java.util.Scanner;

public class ForwardAndBackwardShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next();
	
//		forward shift
		char[] FStr=new char[input.length()];
		for (int i = 0; i <input.length(); i++) {
			FStr[i]= input.charAt(i);
		}
		
		char temp1= FStr[FStr.length-1];
		for (int i = FStr.length-1; i >0 ; i--) {
			FStr[i]=FStr[i-1];
		}
		FStr[0]=temp1;
		
		String res1=new String(FStr);
		System.out.println(res1);
		
		char[] BStr=new char[input.length()];
		for (int i = 0; i <input.length(); i++) {
			BStr[i]= input.charAt(i);
		}
		
		char temp2= BStr[0];
		for (int i = 0; i < BStr.length-1; i++) {
			BStr[i]= BStr[i+1];
		}
		BStr[BStr.length-1]=temp2;
		String res2=new String(BStr);
		System.out.println(res2);
		
		if(res1.equals(res2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
//		second approch 
		String forword= input.charAt(input.length()-1)+input.substring(0,input.length()-1);
		String Bacword= input.substring(1, input.length()-1)+input.charAt(0);
		System.out.println(forword+' '+Bacword);
		if(forword.equals(Bacword)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
