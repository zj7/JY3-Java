package java0409;

public class Rectangle {
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	
	int length;
	int width;
	
	public int getArea(int width,int length)
	{
		return width * length;
	}
	
	public int getPer(int width,int length)
	{
		return 2*(width + length);
	}
	
	public void showAll(int width,int length)
	{
		System.out.println("��Ϊ��"+length);
		System.out.println("��Ϊ��"+width);
		System.out.println("���Ϊ��"+width * length);
		System.out.println("�ܳ�Ϊ��"+2*(width + length));
	}
	
	
public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();
	rectangle.showAll(10,20);
}
}
