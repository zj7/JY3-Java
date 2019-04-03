import java.util.*;
public class  Test0403
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String inputName = scanner.next();
		char char1 = inputName.charAt(0);
		System.out.print("请输入密码：");
		String inputPsw = scanner.next();
		char char2 = inputPsw.charAt(0);
		char userName = 'z';
		char passWord = 'x';
		if (userName == char1 && passWord == char2)
		{
			System.out.println("Login Success!");
		}
	}
}
