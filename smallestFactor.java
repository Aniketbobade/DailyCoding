package codes;

import java.util.Scanner;

public class smallestFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		smallest(a);
	}

	private static void smallest(int a) {
		// TODO Auto-generated method stub
		int i, j = 0;
		int small[] = new int[1000];

		if (a < 10) {
			System.out.println(a + 10);
		} else {
			for (i = 9; i > 1; i--) {
				while (a % i == 0) {
					a = a / i;
					small[j] = i;
					j++;
				}
			}
			if (a > 10) {
				System.out.println("Not possible");
			}

			for (i = j - 1; i >= 0; i--) {
				System.out.print(small[i]);
			}
		}

	}
}

//input 10 output 2*5=10 then output value 25 
