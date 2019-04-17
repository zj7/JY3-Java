package javaAlgorithm;

public class JavaWork27 {
	//输出一百以内的素数
	public static void main(String[] args) {
		System.out.print("2 ");
		for (int i = 3; i <= 100; i++) {
			int j = 2;
			while (i%j != 0) {
				j++;
				if(j*j>i) {
					System.out.print(i+" ");
					break;
				}
				
			}
		}
	}
}

