package java0415;

public class Rectangle extends Shape{
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	int a;
	int b;
	
	protected void area(int a,int b)
	{
		
	}
	
	protected boolean contains(Point p)
	{
		if(p.x < a && p.x > 0 && p.y < b && p.y > 0)
		{
			return true;
		}
		return false;
	}
	
}
