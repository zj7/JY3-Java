package javaAlgorithm;

import java.util.Scanner;

public class JavaWork04 {
	public static void main(String[] args) {
		//分解质因数
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数：");
		int num = scanner.nextInt();
		int i = 2; 
		while(num != 1)
		{
			while (num%i == 0) 
			{
				num = num / i;
				System.out.print(i+" ");
			}
			i++;
		}
		scanner.close();
	}
}
