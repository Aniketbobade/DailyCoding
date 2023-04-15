package codes;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheSumOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		System.out.println("Enter the array values of A");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		
		System.out.println("Enter the array values of B");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextLong();
		}
		
		long x=minvalue(a,b,n);
		System.out.println(x);
	}

	private static long minvalue(long[] a, long[] b, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
            for(int j=(i+1);j<a.length;j++){
                if(Long.compare(a[i], a[j]) < 0){
                    long temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
		
        
        for(int i=0;i<b.length;i++){
            for(int j=(i+1);j<b.length;j++){
                if(Long.compare(b[i], b[j]) > 0){
                    long temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(b));
        
        
        
        long sum=0L;
        for(int i=0;i<n;i++){
           sum+=a[i]*b[i]; 
        }
        
        return sum;
	}

}
