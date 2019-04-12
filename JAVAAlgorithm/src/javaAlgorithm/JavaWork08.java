package javaAlgorithm;

import java.util.Scanner;

public class JavaWork08 {
	public static void main(String[] args) {
		//连数相加
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数：");
		int a = scanner.nextInt();
		System.out.println("输入连续次数：");
		int b = scanner.nextInt();
		int sum = 0;
		int num = 0;
		for(int i = 1;i <= b;i++)
		{
			num = num * 10 + a;
			sum += num;
		}
		System.out.println("和为："+sum);
		scanner.close();
	}
}
