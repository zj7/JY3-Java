package javaAlgorithm;

public class JavaWork23 {
	//ÇóÄêÁä
	public static void main(String[] args) {
		System.out.println(f(5));
	}
	public static int f(int x)
	{
		if(x == 1) {
			return 10;
		}
		else {
			int y = 2 + f(x-1);
			return y;
		}
	}
}
