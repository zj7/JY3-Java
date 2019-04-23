package com.java0423;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedDemo {
	//»º³åÁ÷
	public static void main(String[] args) {
		File file = new File("C:\\writer.txt");
		try(Reader r = new FileReader(file);
		BufferedReader reader = new BufferedReader(r);) {
			String str = null;
			while ((str = reader.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
