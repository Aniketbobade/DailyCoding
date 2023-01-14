package codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,3};
		int b[]= {2,4,1,3,2};
		
		boolean flag=isSamElement(a,b);
		System.out.println(flag);
		
	}

	private static boolean isSamElement(int[] a, int[] b) {
		// TODO Auto-generated method stub
		boolean flag=true;
		Set<Integer> s1=new HashSet<>(Arrays.stream(a).boxed().collect(Collectors.toList()));
		Set<Integer> s2=new HashSet<>(Arrays.stream(b).boxed().collect(Collectors.toList()));
		
		if(s1.size()!=s2.size()) {
			return !flag;
		} 
		for (Integer integer : s2) {
			if(!s1.contains(integer))
				return !flag;
		}
		return true;
	}

}
