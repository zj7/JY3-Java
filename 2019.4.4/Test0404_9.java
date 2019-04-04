public class Test0404_9 
{
	public static void main(String[] args) 
	{
		//Êä³ö·¿×Ó
		for (int i=1;i<=5 ; i++)
		{
			for (int k=4;k>=i-1 ; k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print("*");
			}
			for (int m=2; m<2 * i; m++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 1;i <= 5; i++)
		{
			System.out.print(" ");
			for (int j = 1;j <= 14; j++)
			{
				if (i==1 || i==5 || j==1 || j==14)
				{
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
