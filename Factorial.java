package codes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        while(true) {
        	int temp=factorial%10;
        	if(temp!=0) {
        		System.out.println(temp);
        		break;
        	}else {
        		factorial=factorial/10;
        	}
        }
        
	}

}
