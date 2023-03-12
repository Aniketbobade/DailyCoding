package codes;

public class SumOfDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(a.length);
		int n=a.length;
		int d1=0;
		int d2=0;
		for (int i = 0; i <n; i++) {
			d1+=a[i][i];
			d2+=a[i][n-(i+1)];
		}
		System.out.println("Diagonal one is "+d1);
		System.out.println("Diagonal two is "+d2);
	}

}
