package javaAlgorithm;

import java.util.Scanner;

public class JavaWork26 {
	//输入第一个字母判断星期几，若第一个字母一样，则判断第二个字母
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个字母：");
		char char1 = scanner.next().charAt(0);
		if (char1 == 'm' || char1 == 'M') {
			System.out.println("星期一");
		}
		if (char1 == 't' || char1 == 'T') {
			System.out.println("请输入第二个字母");
			char char2 = scanner.next().charAt(0);
			if (char2 == 'u' || char2 == 'U') {
				System.out.println("星期二");
			}
			if (char2 == 'h' || char2 == 'H') {
				System.out.println("星期四");
			}else {
				System.out.println("输入有误");
			}
		}
		if (char1 == 'w' || char1 == 'W') {
			System.out.println("星期三");
		}
		if (char1 == 'f' || char1 == 'F') {
			System.out.println("星期五");
		}
		if (char1 == 's' || char1 == 'S') {
			System.out.println("请输入第二个字母");
			char char3 = scanner.next().charAt(0);
			if (char3 == 'u' || char3 == 'U') {
				System.out.println("星期日");
			}
			if (char3 == 'a' || char3 == 'A') {
				System.out.println("星期六");
			}else {
				System.out.println("输入有误");
			}
		}
		else {
		System.out.println("输入有误");
		}
		scanner.close();
	}
}
