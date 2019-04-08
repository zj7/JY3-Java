import java.util.*;
public class Homework8 
{
	//Êä³öÑî»ÔÈı½Ç
	public static void main(String[] args) 
	{
		int[] a = new int[10];
		int[] b = new int[10];
		for(int i=0 ; i<=9 ; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(j == 0 || j == i)
				{
					a[j] = 1;
				}else
				{
					a[j] = b[j] + b[j-1];
				}
			}
			for(int k=0;k<=i;k++)
			{
				b[k] = a[k];
				System.out.print(a[k]+"\t");
			}
			System.out.println();
		}
	}
}
