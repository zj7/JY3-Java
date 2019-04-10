package java0410;

public class Person {
	
	public Person()
	{
		
	}
	
	public Person(String name,int age,double height)
	{
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	String name;
	int age;
	double height;
	
	public void sayHello()
	{
		System.out.println("hello,my name is "+name);
	}
}