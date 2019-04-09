package java0408;

public class CircleTest {

	
	public static void main(String[] args)
	{
		Point center = new Point(0,1);
		Circle c = new Circle(center ,5);
		System.out.println(c.getArea(5));
		//要比较的点
		Point comparePoint = new Point(1,10);
		//调用比较的方法
		System.out.println(c.Contains(comparePoint.x,comparePoint.y) == true ? "在圆内":"在圆外");
		
	}
}
