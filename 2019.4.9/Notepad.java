package java0409;

public class Notepad {
	
	public Notepad()
	{
		
	}
	
	public Notepad(char color,int cpu)
	{
		this.color = color;
		this.cpu = cpu;
	}
	
	char color;
	int cpu;
public static void main(String[] args) {
	Notepad pad1 = new Notepad('ºì',2800);
	System.out.println(pad1.color);
	System.out.println(pad1.cpu);
}
}
