package javaAlgorithm;

public class JavaWork22 {
	//利用递归方法求5!
	public static void main(String[] args) {
		System.out.println(f(5));
	}
	public static int f(int x)
	{
		if(x == 1)
		{
			return 1;
		}
		else
		{
			int y = x * f(x-1);
			return y;
		}
	}
}
