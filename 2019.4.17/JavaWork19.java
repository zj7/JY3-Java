package javaAlgorithm;

public class JavaWork19 {
	public static void main(String[] args) {
		//Êä³öÁâĞÎ
		for (int i = 1; i < 5; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int p = 1; p < 4; p++) {
			for (int m = 1; m <= p; m++) {
				System.out.print(" ");
			}
			for (int n = 5; n > (p-1) * 2; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
