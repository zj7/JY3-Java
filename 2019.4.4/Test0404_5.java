import java.util.*;
public class Test0404_5 
{
	public static void main(String[] args) 
	{
		//输出水仙花数
		for (int i = 100;i <= 999; i++)
		{
			int a3 = i%10;
			int a2 = i/10 % 10;
			int a1 = i/100;
			if (i == Math.pow(a1,3)+Math.pow(a2,3)+Math.pow(a3,3))
			{
				System.out.println(i);
			}
		}
		
	}
}
