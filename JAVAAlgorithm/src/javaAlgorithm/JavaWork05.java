package javaAlgorithm;

import java.util.Scanner;

public class JavaWork05 {
	public static void main(String[] args) {
		//��Ŀ�����Ƕ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = scanner.nextInt();
		System.out.println(score >= 90 ? "A":(score>=60?"B":"C"));
		scanner.close();
	}
}
