package java0409;
import java.util.*;
public class UserTest {

	public static void main(String[] args)
	{
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = scanner.next();
		System.out.print("���������룺");
		String psw = scanner.next();
		boolean checkuser = user.checkUser(name, psw);
		System.out.print(checkuser);
		scanner.close();
	}
}
