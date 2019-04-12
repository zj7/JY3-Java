package javaAlgorithm;

import java.util.Scanner;

public class JavaWork15 {
	public static void main(String[] args) {
		//三个数由小到大输出
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		System.out.println("请输入第三个数：");
		int c = scanner.nextInt();
		if(a>b)
		{
			a ^= b;
			b ^= a;
			a ^= b;
		}
		if(a>c)
		{
			a ^= c;
			c ^= a;
			a ^= c;
		}
		if(b>c)
		{
			b ^= c;
			c ^= b;
			b ^= c;
		}
		System.out.println(a+" "+b+" "+c);
		scanner.close();
	}
}
