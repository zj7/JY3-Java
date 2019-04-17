package javaAlgorithm;

import java.util.Scanner;

public class JavaWork24 {
	//一个正整数，输出它是几位数，并逆序打印出各位数字
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		String str = scanner.next();
		int num = str.length();
		System.out.println("这是个"+num+"位数");
		for (int i = str.length()-1;i >= 0;i--) {
			System.out.print(str.charAt(i));
		}
		scanner.close();
	}
}
