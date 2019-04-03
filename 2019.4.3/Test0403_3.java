import java.util.*;
public class Test0403_3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = scanner.nextInt();
		double base = 7.7 / 100;
		double rate = 0;
		if (year <= 0 )
		{
			System.out.print("输入错误！");
		}else if (year <= 1)
		{
			rate = base * 0.5;
		}else if (year <= 3)
		{
			rate = base * 0.7;
		}else if (year <= 5)
		{
			rate = base;
		}else rate = base * 1.1;
		System.out.println("实际的年利率为："+rate);
	}
}
