package javaAlgorithm;

import java.util.*;
public class JavaWork01 {
	
	public static void main(String[] args) {
		//斐波那契数列
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		System.out.println(f(month));
		scanner.close();
	}
	public static int f(int x)
	{
		if(x==1 || x==2)
		{
			return 1;
		}else {
			int y = f(x-1) + f(x-2);
			return y;
		}
	}
}
