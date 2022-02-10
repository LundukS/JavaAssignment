package javaAssignments;

import java.util.Arrays;

public class rotateArrayByK {
	static int[] num_copy;

	public static int[] rotate(int[] nums, int k) {
		num_copy =new int[nums.length] ;

		for (int j = 0; j < nums.length; j++) {
			if(j+k < nums.length) {
				num_copy[j+k] = nums[j];
			}
			else {
				int index = (j+k - nums.length);
				num_copy[index] = nums[j];
			}
		}

		return (num_copy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,4,5,6,7 };
		int k = 2;

		System.out.println(Arrays.toString(rotateArrayByK.rotate(nums, k)));
//		System.out.println(nums.length);

	}

}
