package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] nums = {4,2,8,5,10};
		int i=0;
		Arrays.sort(nums);
		int highVal = nums[nums.length-1];
		
		for (int j=1; j<=highVal ; j++) {
			if(nums[i] != j) {
				System.out.println("Numbers missing in an Array: " +j);
			} else {
				i=i+1;
			}
							
		}
	}
}