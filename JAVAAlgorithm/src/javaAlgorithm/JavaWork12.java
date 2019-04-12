package javaAlgorithm;

import java.util.Scanner;

public class JavaWork12 {
	public static void main(String[] args) {
		//求应发放奖金总数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入利润：");
		long i = scanner.nextLong();
		int prize = 0;
		if(i<0)
		{
			System.out.println("输入错误！");
		}else if(i<=100000)
		{
			prize = (int)(i * 0.1);
		}else if(i<=200000)
		{
			prize = (int)(10000 + (i-100000) * 0.075);
		}else if(i<=400000)
		{
			prize = (int)(17500 + (i-200000) * 0.05);
		}else if(i<=600000)
		{
			prize = (int)(27500 + (i-400000) * 0.03);
		}else if(i<=1000000)
		{
			prize = (int)(33500 + (i-600000) * 0.015);
		}else
		{
			prize = (int)(39500 + (i-1000000) * 0.01);
		}
		System.out.println("应发放奖金总数为："+prize);
		scanner.close();
	}
}
