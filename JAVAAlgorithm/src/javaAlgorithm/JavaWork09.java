package javaAlgorithm;

public class JavaWork09 {
	public static void main(String[] args) {
		//���1000���ڵ�����
		int i = 2;
		while (i<=1000)
		{
			int sum = 0;
			for(int j=1;j<i;j++)
			{
				if(i%j == 0)
				{
					sum += j;
				}
			}
			if(i == sum)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
