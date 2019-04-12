package javaAlgorithm;

public class JavaWork03 {
	public static void main(String[] args) {
		//输出水仙花数
		for(int i=100;i<=999;i++)
		{
			if(i == Math.pow(i/100, 3) + Math.pow(i/10 % 10, 3) + Math.pow(i%10, 3))
			{
				System.out.println(i);
			}
		}
	}
}
