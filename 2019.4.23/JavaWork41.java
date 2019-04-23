package javaAlgorithm;


public class JavaWork41 {
	//Ётлрвс
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			if((i-1)%5==0) {
				int i2 = (i-1)/5*4;
				if((i2-1)%5==0) {
					int i3 = (i2-1)/5*4;
					if((i3-1)%5==0) {
						int i4 = (i3-1)/5*4;
						if((i4-1)%5==0) {
							System.out.println(i);
						}
					}
				}
			}
		}
	}
}
