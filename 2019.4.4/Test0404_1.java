public class Test0404_1
{
	public static void main(String[] args) 
	{
		int x = 8, y = 2,z = 0;
		x = ++x * y;
		z = x / y++;
		System.out.println(x);
		System.out.println(z);
	}
}
