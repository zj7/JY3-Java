package javaAlgorithm;

import java.util.Scanner;

public class JavaWork39 {
	//��дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
	//������nΪ����ʱ�����ú���1/1+1/3+...+1/n
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n��");
		int n = scanner.nextInt();
		double sum = 0;
		if(n%2 == 0) {
			for (int i = 2; i <= n; i+=2) {
				sum += (double)1/i;
			}
		}
		if(n%2 != 0) {
			for (int i = 1; i <= n; i+=2) {
				sum += (double)1/i;
			}
		}
		System.out.println(sum);
		scanner.close();
	}
//	public static double f(int n) {
//		if(n == 2)
//			return 1/n;
//		else 
//			return f(n-2);
//	}
}
