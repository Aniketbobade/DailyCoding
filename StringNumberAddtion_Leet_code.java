package codes;

import java.util.Scanner;

public class StringNumberAddtion_Leet_code {
	
	public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int a= i>=0 ? num1.charAt(i)-'0':0;
            int b= j>=0 ? num2.charAt(j)-'0':0;
            int sum=carry+a+b;
            carry=sum/10;
            sb.append(sum%10);
           
            j--;
            i--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		String num1=sc.next();
		System.out.println("Enter the second number");
		String num2=sc.next();
		
		String res=addStrings(num1, num2);
		System.out.println("Addition is ");
		System.out.println(res);
	}

}
