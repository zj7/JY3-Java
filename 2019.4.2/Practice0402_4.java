import java.util.*;
public class  Practice0402_4
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入一个数");
		double num = scanner.nextDouble();
		double y = f(num);
		System.out.println(y);
	}
	public static double f(double x)
	{
		double result = x * x - 2 * x + 4;
		return result;
	}
}
