package codes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SankePatternInMatrix {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int matrix[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					matrix[i][j] = sc.nextInt();
			}

			
			ArrayList<Integer> ans = snakePattern(matrix);
			for (Integer val : ans)
				System.out.print(val + " ");
			System.out.println();
		}
	}

	private static ArrayList<Integer> snakePattern(int[][] matrix) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<>();
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < row; j++) {
					res.add(matrix[i][j]);
				}
			} else {
				for (int j = row - 1; j >= 0; j--) {
					res.add(matrix[i][j]);
				}
			}

		}
		return res;
	}
}