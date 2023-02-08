package codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniquePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,2,3};
		
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					cnt++;
			}
		}
		int b[]=new int[a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			int cnt1=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					cnt1++;
					break;
				}
			}
			if(cnt1==0) {
				b[index++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i]+" "+b[j]);
			}
		}
		Integer z[]= {1,2,3,2,3};
		Set<Integer> treeSet=new TreeSet<Integer>();
		Collections.addAll(treeSet,z);
		System.out.println(treeSet);
		
		
	}

}
