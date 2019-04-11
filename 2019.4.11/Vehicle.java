package java0410;

public class Vehicle {
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(int speed,double size)
	{
		this.speed = speed;
		this.size = size;
	}
	
	int speed;
	double size;
	
	public void move()
	{
		System.out.println("¿ª³µÁË");
	}
	
	public int setSpeed(int speed)
	{
		return speed;
	}
}
