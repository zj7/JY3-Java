package java0408;

public class CircleTest {

	
	public static void main(String[] args)
	{
		Point center = new Point(0,1);
		Circle c = new Circle(center ,5);
		System.out.println(c.getArea(5));
		//Ҫ�Ƚϵĵ�
		Point comparePoint = new Point(1,10);
		//���ñȽϵķ���
		System.out.println(c.Contains(comparePoint.x,comparePoint.y) == true ? "��Բ��":"��Բ��");
		
	}
}
