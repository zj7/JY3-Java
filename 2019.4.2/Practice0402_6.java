import java.util.*;
public class Practice0402_6 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("ÊäÈëºá×ø±êx1£º");
		int x1 = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("ÊäÈë×İ×ø±êy1£º");
		int y1 = scanner2.nextInt();
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("ÊäÈëºá×ø±êx2£º");
		int x2 = scanner3.nextInt();
		Scanner scanner4 = new Scanner(System.in);
		System.out.print("ÊäÈë×İ×ø±êy2£º");
		int y2 = scanner4.nextInt();
		double L = f(x1,y1,x2,y2);
		System.out.print(L);
		//int i = 1;
		//boolean b = 3 + 4 > 4||5 != 6 && 7 > 8 + ++i;
		//System.out.println(b);
	}
	public static double f(int a1,int b1,int a2,int b2)
	{
		double result = Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
		return result;
	}
}
