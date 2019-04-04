public class Test0404_4 
{
	public static void main(String[] args) 
	{
		//跳过个位是3的数
		int sum = 0;
		for (int i = 1;i <= 100; i++)
		{
			if (i%10 != 3)
			{
				sum += i;
			}
		}
		System.out.print(sum);
	}
}
