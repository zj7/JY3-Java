package javaAlgorithm;

import java.util.Scanner;

public class JavaWork07 {
	public static void main(String[] args) {
		//ͳ��Ӣ����ĸ���ո����ֺ������ַ��ĸ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����ַ�����");
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
		System.out.println("Ӣ����ĸ�У�"+a+"�����ո��У�"+b+"���������У�"+c+"���������ַ��У�"+d+"��");
		scanner.close();
	}
}
