public class Homework5 
{
	public static void main(String[] args) 
	{
		//��
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
						System.out.println("������"+i+"ֻ "+"ĸ����"+j+"ֻ "+"С����"+k+"ֻ");
					}
				}
			}
		}
	}
}
