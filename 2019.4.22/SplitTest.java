package com.java0422;

import java.util.Arrays;

public class SplitTest {
	public static void main(String[] args) {
		String str = "010-123456789-010";
		String[] str1 = str.split("-");
		String str2 = str.replace('-','\u0000');
		System.out.println(Arrays.toString(str1));
		System.out.println(str2);
	}
}
