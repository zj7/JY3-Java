public class Homework7 
{
	//ì³²¨ÄÇÆõÊıÁĞ
	public static void main(String[] args) 
	{
		int result = f(10);
		System.out.print(result);
	}
	public static int f(int x)
	{
		int y = 0;
		if(x == 1 || x == 2)
		{
			return 1;
		}else	{
			y = f(x-1) + f(x-2);
		}
		return y;
	}
}
