package codes;


public class RotalteArrayForGivenNumber {

	 static int[] rotate(int nums[], int n, int k) {

	        if (k > n)
	            k = k % n;

	        int[] ans = new int[n];

	        for (int i = 0; i < k; i++) {
	            ans[i] = nums[n - k + i];
	        }

	        int index = 0;
	        for (int i = k; i < n; i++) {
	            ans[i] = nums[index++];
	        }
	        return ans;
	    }
	    public static void main(String[] args) {
	        int Array[] = { 1, 2, 3, 4, 5 };
	        int N = 5;
	        int K = 2;

	        int[] ans = rotate(Array, N, K);
	        for (int i = 0; i < N; ++i) {
	            System.out.println(ans[i]);
	        }
	    }

}
