import java.util.*;
public class  Test0403_2
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入购买数量：");
		int num = scanner.nextInt();
		int price = 0;
		if (num <= 0 )
		{
			System.out.println("输入错误！");
		}else if (num == 1)
		{
			price = 6;
		}else price = 6 + 3 * (num - 1);
		System.out.println("一共的价格为："+price);
	}
}
