package java0409;

public class MarryTest {
	
	
	public static void main(String[] args)
	{
		Person boy = new Person("gz12345","Jack",'男',22,false,"23156145","美国","1351463146",null);
		Person girl = new Person("gz54321","Rose",'女',20,false,"24986145","美国","1389746146",boy);
		boy.anotherPerson = girl;
		boolean marry = boy.marry(girl);
		System.out.println(marry == true ? "恭喜了！":"不让结！");
		System.out.println("Jack的婚否状态："+boy.isMarry);
		System.out.println("Rose的婚否状态："+girl.isMarry);
		System.out.println("Jack的伴侣："+boy.anotherPerson.pName);
		System.out.println("Rose的伴侣："+girl.anotherPerson.pName);
	}

	
	
	

}
