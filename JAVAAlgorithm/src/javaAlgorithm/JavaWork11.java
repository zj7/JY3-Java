package javaAlgorithm;

public class JavaWork11 {
	public static void main(String[] args) {
		//1~4����ɶ��ٸ�������ͬ�����ظ����ֵ���λ��
		for(int i=123;i<=432;i++)
		{
			int a = i/100;
			int b = i/10 % 10;
			int c = i%10;
			//������1~4
			if(a<5 && b<5 && c<5 && a*b*c!=0)
			{
				//���ֲ��ظ�
				if(a != b && b != c && c != a)
				{
					System.out.println(i);
				}
			}
		}
	}
}
