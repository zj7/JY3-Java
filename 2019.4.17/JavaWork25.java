package javaAlgorithm;

import java.util.Scanner;

public class JavaWork25 {
	//�ж�һ����λ���ǲ��ǻ�����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = scanner.nextInt();
		System.out.println(palindrome(num) == true?"��":"����");
		scanner.close();
	}
	public static boolean palindrome(int x)
	{
		if(x%10 == x/10000 && x/1000 %10 == x/10 %10) {
			return true;
		}
		return false;
	}
}
