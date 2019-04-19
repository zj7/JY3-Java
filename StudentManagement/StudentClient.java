package java0413;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	
	public StudentClient() {
		
	}
	
	//初始化用户名和密码
	static String userName = "admin";
	static String passWord = "admin";
	
	//创建scanner
	Scanner scanner = new Scanner(System.in);
	//防止栈溢出
	StudentManager sm = new StudentManager(this);
	
	//主函数在这里
	public static void main(String[] args) {
		StudentClient studentclient = new StudentClient();
		studentclient.welcomePage();
		
	}
	
	//初始欢迎界面
	public void welcomePage()
	{
		System.out.println("-----------------欢迎登录学生信息管理系统--------------------");
		System.out.println("1.登录"+"\t"+"2.退出");
		System.out.println("-----------------------------------------------------");

		System.out.println("请选择：");
		int num1 = scanner.nextInt();
		switch (num1) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名：");
			String username = scanner.next();
			System.out.println("请输入密码：");
			String psw = scanner.next();
			Admin admin = new Admin(username, psw);
			if(login(admin) == true)
			{
				System.out.println("登录成功"+"\n"+"欢迎您"+username);
				studentManagerIndex();
			}else {
				System.out.println("登录失败，用户名或密码错误");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("正在退出...");
			exitSystem();
			break;
		default:
			System.out.println("输入有误");
			welcomePage();
			break;
		}
	}
	
	//登录方法
	public boolean login(Admin admin)
	{
		if(userName.equals(admin.username) && passWord.equals(admin.password))
		{
			return true;
		}
		return false;
	}
	//退出系统
	public void exitSystem()
	{
		System.exit(0);
	}
	
	//学生管理界面
	public void studentManagerIndex()
	{
		System.out.println("***************************请选择要操作的信息对应数字***************************");
		System.out.println("*1.查看学生信息"+"\t"+"2.添加学生信息"+"\t"+"3.删除学生信息"+"\t"+"4.修改学生信息"+"\t"+"5.退出"+"\t"+"*");
		System.out.println("*************************************************************************");
		System.out.println("请选择：");
		
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			studentManagerIndex();
			break;
		case 2:
			sm.addStuPage(scanner);
			break;
		case 3:
			System.out.println("请输入要删除的ID");
			int stuId = scanner.nextInt();
//			for (int i = 0; i < StudentManager.stus.length; i++)
//			{
//				while (stuId != StudentManager.stus[i].getId())
//				{
//					System.out.println("没有此ID,输入错误");
//					System.out.println("请输入要修改的id");
//					stuId = scanner.nextInt();
//					if(stuId == StudentManager.stus[i].getId())
//					{
//						break;
//					}
//				}
//			}
			sm.deleteStudent(stuId);
			System.out.println("删除成功！");
			studentManagerIndex();
			break;
		case 4:
			updatePage();
		default:
			System.out.println("不能看好了再输入？");
			studentManagerIndex();
			break;
		}
	}
	
	//修改信息界面
	public void updatePage()
	{
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息"+"\t"+"2.根据ID修改学生部分信息"+"\t"+"3.返回上级目录"+"\t"+"4.系统退出");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("请选择：");
		int num3 = scanner.nextInt();
		switch (num3) {
		case 1:
			allMessage();
			break;
		case 2:
			partMessage();
			studentManagerIndex();
			break;
		case 3:
			studentManagerIndex();
			break;
		case 4:
			exitSystem();
			break;
		default:
			System.out.println("不能看好了再输入？");
			updatePage();
			break;
		}
	}
	
	//修改全部信息
	public void allMessage()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+"+"\t"+"1.查看所有学生信息"+"\t"+"2.根据id查询学生信息"+"\t"+"3.根据id查询学生排名"+"\t"+"4.返回上一层"+"\t"+"+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("请选择菜单：");
		int num4 = scanner.nextInt();
		switch (num4) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			System.out.println("数据查询完毕，系统将自动返回目录......");
			allMessage();
			break;
		case 2:
			sm.seeStuMsgById();
			allMessage();
			break;
		case 3:
			System.out.println("还没考试");
			allMessage();
			break;
		case 4:
			updatePage();
			break;
		default:
			System.out.println("不能看好了再输入？");
			allMessage();
			break;
		}
	}
	
	//修改部分信息
	public void partMessage()
	{
		System.out.println("请输入要修改的id");
		int id = scanner.nextInt();
		//判断ID正确性
		for (int i = 0; i < StudentManager.stus.length; i++) {
			while (id != StudentManager.stus[i].getId())
			{
				System.out.println("没有此ID,输入错误");
				System.out.println("请输入要修改的id");
				id = scanner.nextInt();
				if(id == StudentManager.stus[i].getId())
				{
					break;
				}
			}
		}
		System.out.println("请输入要修改的属性");
		String type = scanner.next();
		
		for (int i = 0; i < StudentManager.stus.length; i++) {
			if(id == StudentManager.stus[i].getId()) {
				if(type.equals("姓名")) {
					System.out.println("请输入修改后的数据");
					String data = scanner.next();
					StudentManager.stus[i].setStuName(data);
				}
				if(type.equals("年龄")) {
					System.out.println("请输入修改后的数据");
					Short data = scanner.nextShort();
					while(data<1 || data>120)
					{
						System.out.println("输入有误");
						System.out.println("请输入学生年龄：");
						data = scanner.nextShort();
						if(data >=1 && data <=120)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuAge(data);
				}
				if(type.equals("年级")) {
					System.out.println("请输入修改后的数据");
					String data = scanner.next();
					while(!data.equals("初级") && !data.equals("中级") && !data.equals("高级"))
					{
						System.out.println("输入错误");
						System.out.println("请输入学生所属年级：");
						data = scanner.next();
						if(data.equals("初级") || data.equals("中级") || data.equals("高级"))
						{
							break;
						}
					}
					StudentManager.stus[i].setStuGrade(data);
				}
				if(type.equals("电话")) {
					System.out.println("请输入修改后的数据");
					String data = scanner.next();
					while(data.length()!=11)
					{
						System.out.println("号码有误");
						System.out.println("请输入学生联系方式：");
						data = scanner.next();
						if(data.length()==11)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuTel(data);
				}
				if(type.equalsIgnoreCase("email")) {
					System.out.println("请输入修改后的数据");
					String data = scanner.next();
					while (data.contains("@") == false || data.contains(".com") == false)
					{
						System.out.println("邮箱格式错误");
						System.out.println("请输入学生电子邮箱：");
						data = scanner.next();
						if(data.contains("@") == true && data.contains(".com") == true)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuEmail(data);
				}
				if(type.equals("地址")) {
					System.out.println("请输入修改后的数据");
					String data = scanner.next();
					StudentManager.stus[i].setStuAddress(data);
				}
			}
		}
		System.out.println("修改成功"+"\n"+"系统自动返回上层目录......");
	}
}
