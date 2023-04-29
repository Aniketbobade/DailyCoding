package codes;

/*
 Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
Example 2:

Input:
3
121 131 20
 
Output:
0

Explanation:
20 is not a palindrome hence the output is 0.

Constraints:
1 <=T<= 50
1 <=n<= 20
1 <=A[]<= 10000
 */

public class PalindromArray {
	
	public static void main(String[] args) {
		int[] a= {111, 222, 333, 444, 555};
		int n=a.length;
		int x=palinArray(a, n);
		if(x==1) {
			System.out.println("palindrom");
		}else {
			System.out.println("non Palindrom");
		}
	}

	public static int palinArray(int[] a, int n)
    {
           //add code here.
           int cnt=0;
           for(int i=0;i<a.length;i++){
             String num=Integer.toString(a[i]);
             int start=0;
             int end=num.length()-1;
             
             while(start<end){
                 if(num.charAt(start)!=num.charAt(end)){
                    return 0;
                 }
                 start++;
                 end--;
             }  
             cnt++;
           }
           return 1;
    }
}
