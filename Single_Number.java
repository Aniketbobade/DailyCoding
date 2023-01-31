package codes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Single_Number {
	 public static int singleNumber(int[] nums) {
	     Map<Integer, Integer> map = new HashMap<>();
	     int x=0;
			for (int i : nums) {
				Integer integer = map.get(i);
				if (integer == null) {
					map.put(i, 1);
				} else {
					map.put(i, integer + 1);
				}
	        }
			for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
				if(entry.getValue()==1) {
					x= entry.getKey();
				}
			}
			return x;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 1, 2, 1, 2 };
		int x=singleNumber(nums);
		System.out.println(x);
	}
}
