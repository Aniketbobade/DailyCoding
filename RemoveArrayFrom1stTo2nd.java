package codes;

import java.util.ArrayList;


public class RemoveArrayFrom1stTo2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 2, 5, 6 };

		ArrayList<Integer> firstList= new ArrayList<>();
		ArrayList<Integer> secondList= new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			firstList.add(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			secondList.add(b[i]);
		}
		
		firstList.removeAll(secondList);
		System.out.println(firstList);
		
		
	}

}
