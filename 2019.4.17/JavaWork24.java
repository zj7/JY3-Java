package javaAlgorithm;

import java.util.Scanner;

public class JavaWork24 {
	//һ����������������Ǽ�λ�����������ӡ����λ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		String str = scanner.next();
		int num = str.length();
		System.out.println("���Ǹ�"+num+"λ��");
		for (int i = str.length()-1;i >= 0;i--) {
			System.out.print(str.charAt(i));
		}
		scanner.close();
	}
}
