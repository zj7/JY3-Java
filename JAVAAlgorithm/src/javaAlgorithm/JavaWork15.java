package javaAlgorithm;

import java.util.Scanner;

public class JavaWork15 {
	public static void main(String[] args) {
		//��������С�������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		System.out.println("���������������");
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
