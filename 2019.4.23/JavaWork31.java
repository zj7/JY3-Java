package javaAlgorithm;

import java.util.Arrays;

public class JavaWork31 {
	//��һ�������������
	public static void main(String[] args) {
		int[] arr1 = {
				1,2,3,7,6,5,4
		};
		int[] arr2 = new int[arr1.length];
		for (int i = 0,j = arr1.length-1; i < arr2.length; i++,j--) {
			arr2[i] = arr1[j];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
