package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution{
	public List<List<String>> groupOfAnagrams(String [] str){
		List<List<String>> list=new ArrayList<>();
		Map<String, List<String>> ele=new HashMap<>();
		for (String s : str) {
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			String word=new String(ch);
			if (!ele.containsKey(word)) {
				ele.put(word, new ArrayList<String>());
			}
			ele.get(word).add(s);
		}
		list.addAll(ele.values());
		return list;
	}
}

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"eat","tea","tan","ate","nat","bat"};
		
		Solution obj=new Solution();
		System.out.println(obj.groupOfAnagrams(str));
		
		
		
	}

}
