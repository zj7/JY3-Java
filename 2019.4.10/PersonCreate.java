package java0410;

public class PersonCreate {
	public static void main(String[] args) 
	{
		Person zhangsan = new Person("zhangsan",33,1.73);
		Person lisi = new Person("lisi",44,1.74);
		zhangsan.sayHello();
		lisi.sayHello();
	}

}
