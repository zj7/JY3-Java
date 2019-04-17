package javaAlgorithm;

public class JavaWork21 {
	//Çó1+2!+3!+...+20!µÄºÍ
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int a = 1;
		while(i <= 20)
		{
			a *= i;
			sum += a;
			i++;
		}
		System.out.println(sum);
	}
}
