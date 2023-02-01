package codes;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SubString_Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input "s= welcometojava  And n=3"
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
            String smallest = "";
            String largest = "";
            TreeSet<String> set=new TreeSet<String>(); 
            for(int i=0;i<s.length()-(n-1);i++){
                set.add(s.substring(i, i+n));
            }
            smallest=set.stream().findFirst().get();
            largest=set.last();
         System.out.println(smallest + "\n" + largest);
	}

}
