import java.util.*;
public class Practice0402_7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入基本工资：");
		int num = scanner.nextInt();
		double num2;
		if (num < 5000)
		{
			num2 = num;
		}else if (num < 8000)
		{
			num2 = num * 0.97;
		}else if (num < 17000)
		{
			num2 = num * 0.9;
		}else if (num < 30000)
		{
			num2 = num * 0.8;
		}else if (num < 40000)
		{
			num2 = num * 0.75;
		}else if (num < 60000)
		{
			num2 = num * 0.7;
		}else if (num < 85000)
		{
			num2 = num * 0.65;
		}else num2 = num * 0.55;
		System.out.println("到手的工资为："+num2 * 0.89);
	}
}
