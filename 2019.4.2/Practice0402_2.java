import java.util.*;
public class Practice0402_2
{
	
	public static void main(String[] args)
	{
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("����һ���ַ�");
		//String num = scanner.next();
		//char char2 = num.charAt(0);
		//int result = ChartoInt(char2);
		//char c = InttoChar(a);
		//System.out.print("ת�����������"+result);
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
	//int����תchar���͵ķ���
	public static char InttoChar(int a)
	{
		char result = (char)a;
		return result;	
	}
	//char����תint���͵ķ���
	public static int ChartoInt(char char1)
	{
		return char1;
	}
}