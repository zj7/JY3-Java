import java.util.*;
public class Practice0402_2
{
	
	public static void main(String[] args)
	{
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("输入一个字符");
		//String num = scanner.next();
		//char char2 = num.charAt(0);
		//int result = ChartoInt(char2);
		//char c = InttoChar(a);
		//System.out.print("转换后的数字是"+result);
		int a = 1;
		a = ++a;
		a = a++;
		a = a++ + ++a;
		System.out.println(a-- + ++a + a++ +a);
		System.out.println(a);
		
		int x = 3;
		int y = x++ + ++x + x * 10;
		System.out.println(x);
		System.out.println(y);
	}
	//int类型转char类型的方法
	public static char InttoChar(int a)
	{
		char result = (char)a;
		return result;	
	}
	//char类型转int类型的方法
	public static int ChartoInt(char char1)
	{
		return char1;
	}
}