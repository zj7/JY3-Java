import java.util.*;
public class practice0402
{
	public static void main(String[] args)
	{
		//��������
		int age1 = 20;
		int age2 = 21;
		System.out.println(age1+age2);
		//���������
		int num = 99;
		System.out.println(Integer.toBinaryString(num));
		//���ʮ������
		System.out.println(Integer.toHexString(num));
		//����˽���
		System.out.println(Integer.toOctalString(num));
		//���岻ͬ����
		long num2 = 12345678901L;
		float num3 = 3.1415926F;
		double num4 = 1234567890.0987654321;
		//������A~Z
		char char1 = 'A';
		for (int i=1 ; i<100 ; i++ )
		{
			Random rand = new Random();
			int num5 = rand.nextInt(26);
			char char2 =(char)(char1 + num5);
			System.out.print(char2);
		}
		//ȵ��
		double magpie = 0.00045;
		double lightyear = 9460500000000.0;
		System.out.println(lightyear/magpie);
		//��������
		double x = 384;
		double v = Math.sqrt(2 * 9.8 * x);
		System.out.print(v);
	}
}