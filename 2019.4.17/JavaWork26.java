package javaAlgorithm;

import java.util.Scanner;

public class JavaWork26 {
	//�����һ����ĸ�ж����ڼ�������һ����ĸһ�������жϵڶ�����ĸ
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ����ĸ��");
		char char1 = scanner.next().charAt(0);
		if (char1 == 'm' || char1 == 'M') {
			System.out.println("����һ");
		}
		if (char1 == 't' || char1 == 'T') {
			System.out.println("������ڶ�����ĸ");
			char char2 = scanner.next().charAt(0);
			if (char2 == 'u' || char2 == 'U') {
				System.out.println("���ڶ�");
			}
			if (char2 == 'h' || char2 == 'H') {
				System.out.println("������");
			}else {
				System.out.println("��������");
			}
		}
		if (char1 == 'w' || char1 == 'W') {
			System.out.println("������");
		}
		if (char1 == 'f' || char1 == 'F') {
			System.out.println("������");
		}
		if (char1 == 's' || char1 == 'S') {
			System.out.println("������ڶ�����ĸ");
			char char3 = scanner.next().charAt(0);
			if (char3 == 'u' || char3 == 'U') {
				System.out.println("������");
			}
			if (char3 == 'a' || char3 == 'A') {
				System.out.println("������");
			}else {
				System.out.println("��������");
			}
		}
		else {
		System.out.println("��������");
		}
		scanner.close();
	}
}
