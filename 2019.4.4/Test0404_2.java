public class Test0404_2 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;
		while (i <= 200)
		{
			if (i%3 == 0)
			{
				sum += i;
			}
			i++;
		}
		System.out.print(sum);
	}
}
