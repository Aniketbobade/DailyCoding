package codes;

import java.util.Scanner;

public class MaximumPositiveInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A parking lot in a mall has RxC number of parking spaces. Each parking 
//		space will either be  empty(0) or full(1). The status (0/1) of a parking
//		space is represented as the element of the matrix. The task is to find index
//		of the prpeinzta row(R) in the parking lot that has the most of the parking 
//		spaces full(1).
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the col");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int max=0,count=0,index=0;
		for (int i = 0; i < row; i++) {
			count=0;
			for (int j = 0; j < col; j++) {
				if(a[i][j]==1) {
					count++;
				}
			}
			if(max<count) {
				max=count;
				index=i+1;
			}
		}
		System.out.println(index);
	}

}
