import java.util.*;
public class Test0404_7 
{
	public static void main(String[] args) 
	{
		//ц╟ещеепР
		int[] ary = {1,-5,10,-9,5,15,19};
		for (int i = 0;i < ary.length; i++)
		{
			for (int j = 0;j < ary.length-1-i; j++)
			{
				if (ary[j] > ary[j+1])
				{
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(ary));
	}
}
