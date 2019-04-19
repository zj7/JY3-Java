package java0413;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	public StudentManager()
	{
		
	}
	
	public StudentManager(StudentClient cs)
	{
		this.sc = cs;
	}
	
	//声明一个学生数组
	static Student[] stus = new Student[0];
	//声明一个删除后的学生数组
	static Student[] newStus;
	
	StudentClient sc;
	
	//添加学生
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length-1] = student;
	}
	
	//添加学生信息界面
	public void addStuPage(Scanner scanner)
	{
		System.out.println("******************************添加学生信息******************************");
		//输入id
		System.out.println("请输入学生id：");
		int id = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			while(id == stus[i].getId())
			{
				System.out.println("此id"+id+"存在，请重新输入：");
				System.out.println("请输入学生id：");
				id = scanner.nextInt();
				if(id != stus[i].getId())
				{
					break;
				}
			}
		}
		//输入姓名
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		//输入性别
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		while(sex != '男' && sex != '女')
		{
			System.out.println("输入错误");
			System.out.println("请输入学生性别：");
			sex = scanner.next().charAt(0);
			if(sex == '男' || sex == '女')
			{
				break;
			}
		}
		//输入年龄
		System.out.println("请输入学生年龄（只能1-120之内的数字）：");
		Short age = scanner.nextShort();
		while(age<1 || age>120)
		{
			System.out.println("这好像不是人的年龄");
			System.out.println("请输入学生年龄：");
			age = scanner.nextShort();
			if(age >=1 && age <=120)
			{
				break;
			}
		}
		//输入年级
		System.out.println("请输入学生所属年级（只能初级、中级、高级）：");
		String grade = scanner.next();
		while(!grade.equals("初级") && !grade.equals("中级") && !grade.equals("高级"))
		{
			System.out.println("输入错误");
			System.out.println("请输入学生所属年级：");
			grade = scanner.next();
			if(grade.equals("初级") || grade.equals("中级") || grade.equals("高级"))
			{
				break;
			}
		}
		//输入地址
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		//输入联系方式
		System.out.println("请输入学生联系方式（11位手机号码）：");
		String tel = scanner.next();
		while(tel.length()!=11)
		{
			System.out.println("号码有误");
			System.out.println("请输入学生联系方式：");
			tel = scanner.next();
			if(tel.length()==11)
			{
				break;
			}
		}
		//输入邮箱
		System.out.println("请输入学生电子邮箱（包含@和.com）：");
		String email = scanner.next();
		while (email.contains("@") == false || email.contains(".com") == false)
		{
			System.out.println("邮箱格式错误");
			System.out.println("请输入学生电子邮箱：");
			email = scanner.next();
			if(email.contains("@") == true && email.contains(".com") == true)
			{
				break;
			}
		}
		
		StudentManager studentManager = new StudentManager();
		Student stu = new Student();
		stu.setId(id);
		stu.setStuAddress(address);
		stu.setStuAge(age);
		stu.setStuEmail(email);
		stu.setStuGrade(grade);
		stu.setStuName(name);
		stu.setStuSex(sex);
		stu.setStuTel(tel);
		studentManager.addStudent(stu);
		//返回上层目录
		System.out.println("数据保存成功，系统将自动返回上层目录~");
		sc.studentManagerIndex();
	}
	
	//根据ID删除学生信息
	public Student[] deleteStudent(int stuId)
	{
		//遍历数组
		newStus = new Student[stus.length-1];
		int j = 0;
		for (int i = 0; i < stus.length; i++)
		{
			
			if(stus[i].getId() != stuId)
			{
				newStus[j] = stus[i];
				j++;
			}
			
		}
		stus = newStus;
		return newStus;
	}
	
	//根据ID修改学生全部信息
	
	
	
	//根据ID修改学生部分信息
	
	//根据ID查看学生信息
	public void seeStuMsgById()
	{
		System.out.println("请输入要查询的id");
		int id = sc.scanner.nextInt();
		//判断ID正确性
		for (int i = 0; i < StudentManager.stus.length; i++) {
			if(id == StudentManager.stus[i].getId())
			{
				break;
			}
			System.out.println("没有此Id，自动返回上一级......");
			seeStuMsgById();
		}
		for (int i = 0; i < stus.length; i++) {
			if(id == StudentManager.stus[i].getId())
			{
				System.out.println("------------------------------所有学生信息----------------------------------------");
				System.out.println("|学号"+"\t"+"|姓名"+"\t"+"|年龄"+"\t"+"|性别"+"\t"+"|年级"+"\t"+"|电话"+"\t\t"+"|EMAIL"+"\t\t"+"|地址");
				System.out.println("|"+StudentManager.stus[i].getId()+"\t"+"|"+StudentManager.stus[i].getStuName()+"\t"+"|"+StudentManager.stus[i].getStuAge()
						+"\t"+"|"+StudentManager.stus[i].getStuSex()+"\t"+"|"+StudentManager.stus[i].getStuGrade()+"\t"+"|"+StudentManager.stus[i].getStuTel()
						+"\t"+"|"+StudentManager.stus[i].getStuEmail()+"\t"+"|"+StudentManager.stus[i].getStuAddress());
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
		System.out.println("数据查询完毕，系统将自动返回目录......");
	}
}
