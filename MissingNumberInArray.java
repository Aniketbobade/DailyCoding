package codes;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7,8, 8, 9, 10 };
		int[] x = findMissingNumber(arr, arr.length);
		System.out.println("repating number "+x[0]+" and missing number "+ x[1]);
	}

	public static int[] findMissingNumber(int[] arr, int n) {

		int[] res = new int[2];
		int i = 0;
		while (i < n) {
			if (arr[i] != arr[arr[i] - 1]) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			} else {
				i++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		for (i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				res[0] = arr[i];
				res[1] = i + 1;
			}
		}
		return res;
	}
}
