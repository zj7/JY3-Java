package javaAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class JavaWork30 {
	//已经排好序的数组,输入一个数，要求按原来的规律将它插入数组中
	public static void main(String[] args) {
		int[] nums = {1,3,5,7,9,11,13,15};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		int[] newNums = Arrays.copyOf(nums, nums.length+1);
		newNums[nums.length] = num;
		for (int i = 0; i < newNums.length-1; i++) {
			for (int j = i+1; j < newNums.length; j++) {
				if(newNums[i]>newNums[j]) {
					newNums[i] ^= newNums[j];
					newNums[j] ^= newNums[i];
					newNums[i] ^= newNums[j];
				}
			}
		}
		System.out.println(Arrays.toString(newNums));
		scanner.close();
	}
}
