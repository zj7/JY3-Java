package com.java0422;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo {
	// ‰»Î¡˜
	public static void main(String[] args) {
		File file = new File("C:\\input.txt");
		FileInputStream is = null;
		if(!file.exists()) {
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			is = new FileInputStream(file);
			int len = 0;
			byte[] buffer = new byte[1024];
			String str = null;
			while ((len=is.read(buffer))!=-1) {
				str = new String(buffer, 0, len);
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(null != is) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
