package javaAlgorithm;

public class JavaWork10 {
	public static void main(String[] args) {
		//球自由下落
		double h = 100;
		double s = -100;
		for(int i = 1; i<=10;i++)
		{
			s = s + 2 * h;
			h = h /2;
		}
		System.out.println("共经过距离为："+s+",反弹高度为："+h);
	}
}
