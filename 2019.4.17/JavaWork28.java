package javaAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class JavaWork28 {
	//对十个数排序
	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(10);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(sort(nums)));
	}
	public static int[] sort(int[] nums)
	{
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					nums[i] ^= nums[j];
					nums[j] ^= nums[i];
					nums[i] ^= nums[j];
				}
			}
		}
		return nums;
	}
}
