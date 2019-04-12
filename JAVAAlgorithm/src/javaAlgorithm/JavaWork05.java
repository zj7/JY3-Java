package javaAlgorithm;

import java.util.Scanner;

public class JavaWork05 {
	public static void main(String[] args) {
		//三目运算符嵌套
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = scanner.nextInt();
		System.out.println(score >= 90 ? "A":(score>=60?"B":"C"));
		scanner.close();
	}
}
