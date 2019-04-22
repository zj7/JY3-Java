package com.java0422;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamDemo {
	//序列化和反序列化
	public static void main(String[] args) {
		
		//写出
//		Account account = new Account("Lihua","9bang15bianshi");
//		File file = new File("C:\\account.txt");
//		try(FileOutputStream fileoutputstream = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fileoutputstream)) {
//			oos.writeObject(account);
//			System.out.println("写出成功");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//读入 读取序列化的内容
		File file = new File("C:\\account.txt");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			Object readObject = ois.readObject();
			if(readObject instanceof Account) {
				Account acc = (Account)readObject;
				System.out.println(acc);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
class Account implements Serializable{
	
	public Account() {
		
	}
	
	public Account(String username, String psw) {
		this.username = username;
		this.psw = psw;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	private String username;
	
	private transient String psw;

	@Override
	public String toString() {
		return "Account [username=" + username + ", psw=" + psw + "]";
	}
}