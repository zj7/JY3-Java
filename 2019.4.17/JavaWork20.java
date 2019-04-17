package javaAlgorithm;

public class JavaWork20 {
	//数列2/1,3/2,5/3,8/5,13/8...求前二十项和
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += (double)f(i+1)/(double)f(i);
		}
		System.out.println(sum);
	}
	public static int f(int x)
	{
		if(x == 1)
		{
			return 1;
		}
		if(x == 2)
		{
			return 2;
		}
		else
		{
			int y = f(x-1) + f(x-2);
			return y;
		}
	}
}
