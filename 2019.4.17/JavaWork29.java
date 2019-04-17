package javaAlgorithm;

import java.util.Scanner;

public class JavaWork29 {
	//输出3*3矩阵对角线元素之和
	public static void main(String[] args){
		System.out.println("请输入九个整数：");
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("输入的矩阵是：");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+"\t");
			}
		System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == j || i + j == 2) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("对角线和为："+sum);
		scanner.close();
	}
}
