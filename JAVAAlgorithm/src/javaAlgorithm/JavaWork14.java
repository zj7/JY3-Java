package javaAlgorithm;

import java.util.Scanner;

public class JavaWork14 {
	public static void main(String[] args) {
		//����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������꣺");
		int year = scanner.nextInt();
		System.out.println("�������£�");
		int month = scanner.nextInt();
		System.out.println("�������գ�");
		int day = scanner.nextInt();
		int total = 0;
		switch (month) {
		case 1:
			total = day;
			break;
		case 2:
			total = day + 31;
			break;
		case 3:
			total = day + 59;
			break;
		case 4:
			total = day + 90;
			break;
		case 5:
			total = day + 120;
			break;
		case 6:
			total = day + 151;
			break;
		case 7:
			total = day + 181;
			break;
		case 8:
			total = day + 212;
			break;
		case 9:
			total = day + 243;
			break;
		case 10:
			total = day + 273;
			break;
		case 11:
			total = day + 304;
			break;
		case 12:
			total = day + 334;
			break;
		default:
			break;
		}
		//�ж�����
		if(year%4 == 0)
		{
			if(year%100 == 0 && year%400 != 0)
			{}
			else 
			{
				total += 1;
			}
		}
		System.out.println("��һ������һ��ĵ�"+total+"��");
		scanner.close();
	}
}
