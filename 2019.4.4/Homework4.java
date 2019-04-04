public class Homework4 
{
	public static void main(String[] args) 
	{
		//Ğ¡ÇòÏÂÂä
		double sum = -100;
		double h = 100;
		for (int i = 1;i<=10 ; i++)
		{
			sum = sum + 2 * h;
			h = h/2;
		}
		System.out.println(sum);
		System.out.print(h);
	}
}
