package javaAlgorithm;

public class JavaWork10 {
	public static void main(String[] args) {
		//����������
		double h = 100;
		double s = -100;
		for(int i = 1; i<=10;i++)
		{
			s = s + 2 * h;
			h = h /2;
		}
		System.out.println("����������Ϊ��"+s+",�����߶�Ϊ��"+h);
	}
}
