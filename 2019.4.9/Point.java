package java0409;

public class Point {
	
	public Point()
	{
		
	}
	
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	int x;
	int y;
	
	public void movePoint(int dx,int dy)
	{
		new Point(x,y);
		x += dx;
		y += dy;
	}

}
