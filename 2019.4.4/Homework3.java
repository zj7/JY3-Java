public class Homework3 
{
	public static void main(String[] args) 
	{
		//ÍêÊı
		int sum = 0;
		for (int i = 1;i<=1000 ; i++)
		{
			for (int n=1;n<i ;n++ )
			{
				if (i%n == 0)
				{
					sum += n;
				}
			}
			if (sum == i)
			{
				System.out.println(i);
			}
		}
	}
}
