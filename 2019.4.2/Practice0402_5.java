import java.util.*;
public class Practice0402_5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入一个数：");
		int num = scanner.nextInt();
		int a = f(num);
		int b = g(num);
		System.out.println(a);
		System.out.println(b);
	}
	public static int f(int x)
	{
		int result = x % 3;
		return result;
	}
	public static int g(int x)
	{
		int result = x++;
		return result;
	}
}
