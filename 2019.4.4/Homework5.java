public class Homework5 
{
	public static void main(String[] args) 
	{
		//买鸡
		//int money = 100;
		//int num = 100;
		for (int i = 0;i<=20 ; i++)
		{
			for (int j = 0;j<=33 ;j++ )
			{
				for (int k=0;k<=100 ;k+=3 )
				{
					if (i+j+k == 100 && 5*i + 3*j + k/3 == 100)
					{
						System.out.println("公鸡有"+i+"只 "+"母鸡有"+j+"只 "+"小鸡有"+k+"只");
					}
				}
			}
		}
	}
}
