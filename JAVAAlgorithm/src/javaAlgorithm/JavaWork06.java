package javaAlgorithm;

import java.util.Scanner;

public class JavaWork06 {
	public static void main(String[] args) {
		//���Լ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		System.out.println("���Լ��Ϊ��"+commonDivisor(a,b));
		//��С������
		int commonMultiple = a * b / commonDivisor(a,b);
		System.out.println("��С������Ϊ��"+commonMultiple);
		scanner.close();
	}
	public static int commonDivisor(int m,int n)
	{
		//��֤��һ�����ϴ�
		if(m<n)
		{
			m ^= n;
			n ^= m;
			m ^= n;
		}
		//շת���
		while(m%n != 0)
		{
			int temp = n;
			n = m%n;
			m = temp;
		}
		return n;
	}
}
