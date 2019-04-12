package javaAlgorithm;

public class JavaWork11 {
	public static void main(String[] args) {
		//1~4能组成多少个互不相同且无重复数字的三位数
		for(int i=123;i<=432;i++)
		{
			int a = i/100;
			int b = i/10 % 10;
			int c = i%10;
			//限制在1~4
			if(a<5 && b<5 && c<5 && a*b*c!=0)
			{
				//数字不重复
				if(a != b && b != c && c != a)
				{
					System.out.println(i);
				}
			}
		}
	}
}
