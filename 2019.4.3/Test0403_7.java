public class Test0403_7 
{
	public static void main(String[] args) 
	{
		//Êä³ö³µÅÆºÅ
		int square = 0;
		for (int i = 32;i < 100; i++)
		{
			square = i * i;
			if (square % 10 == square/10 % 10 && square/100 % 10 == square/1000)
			{
				System.out.println(square);
				System.out.print(i);
			}
		}
				
		//int a = 0;
		//int c = 0;
		//do
		//{
		//	--c;
		//	a = a - 1;
		//}
		//while (a > 0);
		//System.out.print(c);
	}
}
