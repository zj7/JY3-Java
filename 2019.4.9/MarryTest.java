package java0409;

public class MarryTest {
	
	
	public static void main(String[] args)
	{
		Person boy = new Person("gz12345","Jack",'��',22,false,"23156145","����","1351463146",null);
		Person girl = new Person("gz54321","Rose",'Ů',20,false,"24986145","����","1389746146",boy);
		boy.anotherPerson = girl;
		boolean marry = boy.marry(girl);
		System.out.println(marry == true ? "��ϲ�ˣ�":"���ýᣡ");
		System.out.println("Jack�Ļ��״̬��"+boy.isMarry);
		System.out.println("Rose�Ļ��״̬��"+girl.isMarry);
		System.out.println("Jack�İ��£�"+boy.anotherPerson.pName);
		System.out.println("Rose�İ��£�"+girl.anotherPerson.pName);
	}

	
	
	

}
