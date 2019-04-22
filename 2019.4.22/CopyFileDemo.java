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
	
	//�ļ�����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Դ�ļ�·����");
		String srcFilePath = scanner.nextLine();
		//ͨ��split�����õ��ļ�����
		String[] split = srcFilePath.split("\\.");
		
		//�����ļ�
		File srcFile = new File(srcFilePath);
		File destFile = new File(split[0]+"_����."+split[1]);
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
