import java.util.*;
public class  Test0403_9
{
	public static void main(String[] args) 
	{
		//实现分页
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数据总数：");
		int total = scanner.nextInt();
		//每页的最大容量
		int data = 10;
		int page = total%data == 0 ? total/data : total/data + 1;
		System.out.print("一共有"+page+"页");
	}
}
