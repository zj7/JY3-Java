package com.java0422;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	
	//文件的write
	public static void main(String[] args) {
		File file = new File("C:\\writer.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try(Writer writer = new FileWriter(file)){
			writer.append("你好");
			writer.append("，世界");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
