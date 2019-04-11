package java0409;

import java.util.Arrays;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("李华",1,99);
		Student s2 = new Student("李华华",2,90);
		Student s3 = new Student("李明",3,100);
		Student s4 = new Student("李明明",4,60);
		Student s5 = new Student("李刚",5,10);
		Student s6 = new Student("李刚刚",6,30);
		
		//排序
		Student[] arr = new Student[] {s1,s2,s3,s4,s5,s6};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].sScore>arr[j+1].sScore)
				{
					//交换分数
					int temp = arr[j].sScore;
					arr[j].sScore = arr[j+1].sScore;
					arr[j+1].sScore = temp;
					//交换姓名
					String temp2 = arr[j].sName;
					arr[j].sName = arr[j+1].sName;
					arr[j+1].sName = temp2;
					//交换学号
					int temp3 = arr[j].sNum;
					arr[j].sNum = arr[j+1].sNum;
					arr[j+1].sNum = temp3;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

}
