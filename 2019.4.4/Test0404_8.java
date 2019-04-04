public class Test0404_8 
{
	public static void main(String[] args) 
	{
		//输出正方形
		for (int i = 1;i <= 11; i++)
		{
			for (int j = 1;j <= 11; j++)
			{
				if (i==1 || i==11 || j==1 || j==11)
				{
					System.out.print("*"+" ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
