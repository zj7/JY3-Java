import java.util.*;
public class  Test0403_9
{
	public static void main(String[] args) 
	{
		//ʵ�ַ�ҳ
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������������");
		int total = scanner.nextInt();
		//ÿҳ���������
		int data = 10;
		int page = total%data == 0 ? total/data : total/data + 1;
		System.out.print("һ����"+page+"ҳ");
	}
}
