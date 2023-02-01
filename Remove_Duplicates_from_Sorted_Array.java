package codes;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
		if(nums.length==0)
			System.out.println(0);
		int addIndex=1;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<nums[i+1]) {
				nums[addIndex]=nums[i+1]; 
				addIndex++;
			}
		}
		System.out.println(addIndex);
	}

}
