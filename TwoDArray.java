package codes;

import java.util.Iterator;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols=sc.nextInt();
		
		int a[][]=new int[row][cols];
//		row wise input
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < cols; j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		col wise input
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < row; j++) {
				a[i][j]=sc.nextInt();
			}
		}
//		output
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
