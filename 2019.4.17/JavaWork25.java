package javaAlgorithm;

import java.util.Scanner;

public class JavaWork25 {
	//判断一个五位数是不是回文数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int num = scanner.nextInt();
		System.out.println(palindrome(num) == true?"是":"不是");
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
