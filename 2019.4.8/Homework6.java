import java.util.*;
public class Homework6 
{
	public static void main(String[] args) 
	{
		//�������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = scanner.nextInt();
		int result = 0;
		while(true)
		{
			int n = num%10;
			result = result * 10 + n;
			num = num / 10;
			if(num == 0)
			{
				break;
			}
		}
		System.out.print(result);
	}
}
