public class Test0403_8 
{
	public static void main(String[] args) 
	{
		//Êä³ö*
		for (int j =1;j < 10; j += 2)
		{
			for (int k=4;k>j/2 ;k-- )
			{
				System.out.print(" ");
			}
			for (int i = 1;i <= j; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
