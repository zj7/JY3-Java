import java.util.*;
public class Test0403_5 
{
	public static void main(String[] args) 
	{
		//��ϰ5
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = scanner.nextInt();
		if (score > 100 || score < 0)
		{
			System.out.print("super man");
		}else if (score >= 90 && score <= 100)
		{
			System.out.print("����");
		}else if (score >=80 && score <90)
		{
			System.out.print("����");
		}else System.out.print("������");
	}
}
