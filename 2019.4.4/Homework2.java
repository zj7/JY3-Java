import java.util.*;
public class Homework2 
{
	public static void main(String[] args) 
	{
		//合并数组
		int[] arr1 = {1,7,9,11,13,15,17,19};
		int[] arr2 = {2,4,6,8,10};
		int[] temp = Arrays.copyOf(arr1,13);
		int[] newArr = temp;
		for (int i = 0;i<=4 ; i++)
		{
			newArr[i+8] = arr2[i];
		}
		System.out.println(Arrays.toString(newArr));
		//升序排列
		int[] ary = newArr;
		for (int i = 0;i < ary.length; i++)
		{
			for (int j = 0;j < ary.length-1-i; j++)
			{
				if (ary[j] > ary[j+1])
				{
					int temp2 = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp2;
				}
			}
		}
		System.out.print(Arrays.toString(ary));
	}
}
