package javaAlgorithm;

public class JavaWork13 {
	public static void main(String[] args) {
		//����100����һ����ȫƽ����������168����һ����ȫƽ����
		int i = 0;
		while(i<100000)
		{
			int j = 1;
			while (j<i)
			{
				if(i + 100 == j * j)
				{
					int k = 1;
					while (k<i)
					{
						if(i+168 == k*k)
						{
							System.out.println(i);
						}
						k++;
					}
				}
				j++;
			}
			i++;
		}
	}
}
