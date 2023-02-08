package codes;


public class CountMaxNumbersInArray {
	public static void main(String[] args) {
		int a[]= {3,4,5,8,9};
		int max=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
