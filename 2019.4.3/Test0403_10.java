import java.util.*;
public class Test0403_10 
{
	public static void main(String[] args) 
	{
		//Á·Ï°8
		String str = "692116851128";
		int oddSum = 0;
		for (int i = 0;i < str.length() ; i += 2)
		{
			char c = str.charAt(i);
			oddSum += c - 48;
		}
		System.out.print(oddSum);
	}
}
