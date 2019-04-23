package javaAlgorithm;

import java.util.Arrays;

public class JavaWork35 {
	//数组中最大的数与第一个数交换
	public static void main(String[] args) {
		int[] nums = new int[] {
				3,9,7,1,5,6
		};
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>temp) {
				temp = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==temp) {
				nums[i] ^= nums[0];
				nums[0] ^= nums[i];
				nums[i] ^= nums[0];
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
