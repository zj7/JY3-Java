package javaAlgorithm;

import java.util.Scanner;

public class JavaWork32 {
	//ȡһ���������Ҷ˿�ʼ��4��7λ
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int a = scanner.nextInt();
		int result = 0;
		int a4 = a/1000;
		for (int i = 1; i < 5; i++) {
			int temp = a4 % 10;
			result = result * 10 + temp;
			a4 = a4 / 10;
		}
		System.out.println(result);
		scanner.close();
	}
}
