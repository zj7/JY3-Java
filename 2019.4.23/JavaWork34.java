package javaAlgorithm;

import java.util.Scanner;

public class JavaWork34 {
	//����3����a,b,c������С˳�����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����a��");
		int a = scanner.nextInt();
		System.out.println("����b��");
		int b = scanner.nextInt();
		System.out.println("����c��");
		int c = scanner.nextInt();
		if(a<b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		if(a<c) {
			a ^= c;
			c ^= a;
			a ^= c;
		}
		if(b<c) {
			b ^= c;
			c ^= b;
			b ^= c;
		}
		System.out.println(a+" "+b+" "+c);
		scanner.close();
	}
}
