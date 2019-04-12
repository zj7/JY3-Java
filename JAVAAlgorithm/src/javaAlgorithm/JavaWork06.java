package javaAlgorithm;

import java.util.Scanner;

public class JavaWork06 {
	public static void main(String[] args) {
		//最大公约数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		System.out.println("最大公约数为："+commonDivisor(a,b));
		//最小公倍数
		int commonMultiple = a * b / commonDivisor(a,b);
		System.out.println("最小公倍数为："+commonMultiple);
		scanner.close();
	}
	public static int commonDivisor(int m,int n)
	{
		//保证第一个数较大
		if(m<n)
		{
			m ^= n;
			n ^= m;
			m ^= n;
		}
		//辗转相除
		while(m%n != 0)
		{
			int temp = n;
			n = m%n;
			m = temp;
		}
		return n;
	}
}
