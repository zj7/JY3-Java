package java0415;

public class Person {
	
	public static void main(String[] args) {
		Person person = new Person();
		Plane p = new Plane();
		Train t = new Train();
		person.play(p);
		person.play(t);
	}
	
	//Íæ
	public void play(Vehicle v)
	{
		v.trip();
	}
}
