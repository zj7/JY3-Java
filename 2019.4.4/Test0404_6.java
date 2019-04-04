import java.util.*;
public class Test0404_6 
{
	public static void main(String[] args) 
	{
		//加密
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个四位数：");
		String str = scanner.next();
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		char c3 = str.charAt(2);
		char c4 = str.charAt(3);
		int a1 = (c1 - 48 + 5) % 10;
		int a2 = (c2 - 48 + 5) % 10;
		int a3 = (c3 - 48 + 5) % 10;
		int a4 = (c4 - 48 + 5) % 10;
		int[] num = new int[4];
		num[0] = a4;
		num[1] = a3;
		num[2] = a2;
		num[3] = a1;
		for (int i=0;i<num.length ;i++ )
		{
			System.out.print(num[i]);
		}
	}
}
