package codes;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Guess the number between 0 to 100");
		Random unknown= new Random();
		int x=(int)unknown.nextInt(100);
		
		while(true){
			System.out.println("Enter the your input number");
			Scanner sc=new Scanner(System.in);
			int input=sc.nextInt();
			if(x==input) {
				System.out.println("YOu Guess the correct answer");
				break;
			}
			else if(x>input) {
				System.out.println("your input is smaller than machine input\nPlease choose large the number");
				
			}
			else if(x<input) {
				System.out.println("your input is greater than than machine input\nplease choose the small number");
				
			}
		}
	}

}
