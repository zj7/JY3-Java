package javaAlgorithm;

import java.util.Scanner;

public class JavaWork08 {
	public static void main(String[] args) {
		//�������
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ������");
		int a = scanner.nextInt();
		System.out.println("��������������");
		int b = scanner.nextInt();
		int sum = 0;
		int num = 0;
		for(int i = 1;i <= b;i++)
		{
			num = num * 10 + a;
			sum += num;
		}
		System.out.println("��Ϊ��"+sum);
		scanner.close();
	}
}
