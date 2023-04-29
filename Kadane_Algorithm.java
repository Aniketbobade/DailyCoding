package codes;

public class Kadane_Algorithm {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,-2,5};
		int n=a.length;
		Long x=maxSubarraySum(a, n);
		System.out.println("maximum sum of subarry is "+x);
	}
	static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int maxi=arr[0];
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)
                sum=0;
        }
        
        Long res = Long.valueOf(maxi);
        return res;
    }
}
