package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighestNumberFromGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			ArrayList<Integer> list=new ArrayList<>();
			
			while(n!=0) {
				int temp=n%10;
				list.add(temp);
				n=n/10;
			}
			Collections.sort(list);
			Collections.reverse(list);
			int res=0;
			for(Integer i:list) {
				res=res*10+i;
			}
			System.out.println(res);
	}

}
