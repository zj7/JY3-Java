package com.java0422;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFileDemo {
	
	//文件复制
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入源文件路径：");
		String srcFilePath = scanner.nextLine();
		//通过split方法拿到文件类型
		String[] split = srcFilePath.split("\\.");
		
		//读入文件
		File srcFile = new File(srcFilePath);
		File destFile = new File(split[0]+"_副本."+split[1]);
		try(InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(destFile);) {
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len=is.read(buffer))!=-1) {
				os.write(buffer, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
