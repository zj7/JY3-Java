package javaAlgorithm;

public class JavaWork02 {
	public static void main(String[] args) {
		//���101-200������
		for(int i = 101;i<201;i++)
		{
			int j = 2;
			while (i%j != 0) 
			{
				j++;
				if(i < j * j)
				{
					System.out.print(i+" ");
					break;
				}
			}
		}
	}
}
