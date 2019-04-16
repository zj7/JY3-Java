package java0416;

import java.util.Arrays;

public class StringTest {
	
	
	static String str = new String("123456");
	
	static String str3 = "ABC";
	
	
	public static void main(String[] args) {
		
		char[] c = {
			'6','7','8','9','0'	
		};
		
		String str2 = new String(c,2,3);
		
		System.out.println(str2);
		
		//compareTo
		String str3 = "AbCde";
		String str4 = "AB";
		System.out.println(str3.compareToIgnoreCase(str4));
		
		//length
		System.out.println(str2.length());
		
		//charAt
		System.out.println(str3.charAt(3));
		
		//substring
		String str5 = "123321200001010123";
		String str6 = str5.substring(6, 14);
		System.out.println(str6);
		
		//concat
		String str7 = str3.concat(str4);
		System.out.println(str7);
		
		//replace
		String str8 = str5.replace("01", "99");
		String str9 = str8.replaceAll("99", "01");
		System.out.println(str8);
		System.out.println(str9);
		
		//indexOf
		System.out.println(str8.indexOf("099"));
		
		//trim
		String str10 = "  A  B  C  D  E  ";
		System.out.println(str10.trim());
		
		//split
		String[] str11 = str9.split("2");
		System.out.println(Arrays.toString(str11));
	}
}
