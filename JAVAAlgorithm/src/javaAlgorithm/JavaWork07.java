package javaAlgorithm;

import java.util.Scanner;

public class JavaWork07 {
	public static void main(String[] args) {
		//统计英文字母、空格、数字和其它字符的个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入字符串：");
		String str = scanner.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0;i<str.length();i++)
		{
			if(97 <= str.charAt(i) && str.charAt(i) <= 122 || 65<=str.charAt(i) && str.charAt(i)<=90)
			{
				a++;
			}
			if(str.charAt(i) == 32)
			{
				b++;
			}
			if(48<=str.charAt(i) && str.charAt(i)<=57)
			{
				c++;
			}
			d = str.length() - a - b - c;
		}
		System.out.println("英文字母有："+a+"个，空格有："+b+"个，数字有："+c+"个，其他字符有："+d+"个");
		scanner.close();
	}
}
