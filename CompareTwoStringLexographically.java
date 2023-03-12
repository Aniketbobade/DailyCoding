package codes;

import java.util.Scanner;

public class CompareTwoStringLexographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first String");
		String str1 = sc.next();
		System.out.println("Enter the sencond String");
		String str2 = sc.next();
		if (str1.length() == str2.length()) {
			int i = 0;
			int cnt = 0;
			while (i < str1.length() && i < str2.length()) {
				if (str1.charAt(i) == str2.charAt(i)) {
					cnt++;
				} else {
					System.out.println(str1.charAt(i) - str2.charAt(i));
					break;
				}
				i++;
			}
			if (str1.length() == cnt || str2.length() == cnt) {
				System.out.println(str1.length() - str2.length());
			}
		}else {
			System.out.println(-1);
		}
	}

}
