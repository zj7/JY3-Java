package java0413;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	
	public StudentClient() {
		
	}
	
	//��ʼ���û���������
	static String userName = "admin";
	static String passWord = "admin";
	
	//����scanner
	Scanner scanner = new Scanner(System.in);
	//��ֹջ���
	StudentManager sm = new StudentManager(this);
	
	//������������
	public static void main(String[] args) {
		StudentClient studentclient = new StudentClient();
		studentclient.welcomePage();
		
	}
	
	//��ʼ��ӭ����
	public void welcomePage()
	{
		System.out.println("-----------------��ӭ��¼ѧ����Ϣ����ϵͳ--------------------");
		System.out.println("1.��¼"+"\t"+"2.�˳�");
		System.out.println("-----------------------------------------------------");

		System.out.println("��ѡ��");
		int num1 = scanner.nextInt();
		switch (num1) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.println("�������û�����");
			String username = scanner.next();
			System.out.println("���������룺");
			String psw = scanner.next();
			Admin admin = new Admin(username, psw);
			if(login(admin) == true)
			{
				System.out.println("��¼�ɹ�"+"\n"+"��ӭ��"+username);
				studentManagerIndex();
			}else {
				System.out.println("��¼ʧ�ܣ��û������������");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("�����˳�...");
			exitSystem();
			break;
		default:
			System.out.println("��������");
			welcomePage();
			break;
		}
	}
	
	//��¼����
	public boolean login(Admin admin)
	{
		if(userName.equals(admin.username) && passWord.equals(admin.password))
		{
			return true;
		}
		return false;
	}
	//�˳�ϵͳ
	public void exitSystem()
	{
		System.exit(0);
	}
	
	//ѧ���������
	public void studentManagerIndex()
	{
		System.out.println("***************************��ѡ��Ҫ��������Ϣ��Ӧ����***************************");
		System.out.println("*1.�鿴ѧ����Ϣ"+"\t"+"2.���ѧ����Ϣ"+"\t"+"3.ɾ��ѧ����Ϣ"+"\t"+"4.�޸�ѧ����Ϣ"+"\t"+"5.�˳�"+"\t"+"*");
		System.out.println("*************************************************************************");
		System.out.println("��ѡ��");
		
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
			System.out.println("������Ҫɾ����ID");
			int stuId = scanner.nextInt();
//			for (int i = 0; i < StudentManager.stus.length; i++)
//			{
//				while (stuId != StudentManager.stus[i].getId())
//				{
//					System.out.println("û�д�ID,�������");
//					System.out.println("������Ҫ�޸ĵ�id");
//					stuId = scanner.nextInt();
//					if(stuId == StudentManager.stus[i].getId())
//					{
//						break;
//					}
//				}
//			}
			sm.deleteStudent(stuId);
			System.out.println("ɾ���ɹ���");
			studentManagerIndex();
			break;
		case 4:
			updatePage();
		default:
			System.out.println("���ܿ����������룿");
			studentManagerIndex();
			break;
		}
	}
	
	//�޸���Ϣ����
	public void updatePage()
	{
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ"+"\t"+"2.����ID�޸�ѧ��������Ϣ"+"\t"+"3.�����ϼ�Ŀ¼"+"\t"+"4.ϵͳ�˳�");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("��ѡ��");
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
			System.out.println("���ܿ����������룿");
			updatePage();
			break;
		}
	}
	
	//�޸�ȫ����Ϣ
	public void allMessage()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+"+"\t"+"1.�鿴����ѧ����Ϣ"+"\t"+"2.����id��ѯѧ����Ϣ"+"\t"+"3.����id��ѯѧ������"+"\t"+"4.������һ��"+"\t"+"+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("��ѡ��˵���");
		int num4 = scanner.nextInt();
		switch (num4) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");
			allMessage();
			break;
		case 2:
			sm.seeStuMsgById();
			allMessage();
			break;
		case 3:
			System.out.println("��û����");
			allMessage();
			break;
		case 4:
			updatePage();
			break;
		default:
			System.out.println("���ܿ����������룿");
			allMessage();
			break;
		}
	}
	
	//�޸Ĳ�����Ϣ
	public void partMessage()
	{
		System.out.println("������Ҫ�޸ĵ�id");
		int id = scanner.nextInt();
		//�ж�ID��ȷ��
		for (int i = 0; i < StudentManager.stus.length; i++) {
			while (id != StudentManager.stus[i].getId())
			{
				System.out.println("û�д�ID,�������");
				System.out.println("������Ҫ�޸ĵ�id");
				id = scanner.nextInt();
				if(id == StudentManager.stus[i].getId())
				{
					break;
				}
			}
		}
		System.out.println("������Ҫ�޸ĵ�����");
		String type = scanner.next();
		
		for (int i = 0; i < StudentManager.stus.length; i++) {
			if(id == StudentManager.stus[i].getId()) {
				if(type.equals("����")) {
					System.out.println("�������޸ĺ������");
					String data = scanner.next();
					StudentManager.stus[i].setStuName(data);
				}
				if(type.equals("����")) {
					System.out.println("�������޸ĺ������");
					Short data = scanner.nextShort();
					while(data<1 || data>120)
					{
						System.out.println("��������");
						System.out.println("������ѧ�����䣺");
						data = scanner.nextShort();
						if(data >=1 && data <=120)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuAge(data);
				}
				if(type.equals("�꼶")) {
					System.out.println("�������޸ĺ������");
					String data = scanner.next();
					while(!data.equals("����") && !data.equals("�м�") && !data.equals("�߼�"))
					{
						System.out.println("�������");
						System.out.println("������ѧ�������꼶��");
						data = scanner.next();
						if(data.equals("����") || data.equals("�м�") || data.equals("�߼�"))
						{
							break;
						}
					}
					StudentManager.stus[i].setStuGrade(data);
				}
				if(type.equals("�绰")) {
					System.out.println("�������޸ĺ������");
					String data = scanner.next();
					while(data.length()!=11)
					{
						System.out.println("��������");
						System.out.println("������ѧ����ϵ��ʽ��");
						data = scanner.next();
						if(data.length()==11)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuTel(data);
				}
				if(type.equalsIgnoreCase("email")) {
					System.out.println("�������޸ĺ������");
					String data = scanner.next();
					while (data.contains("@") == false || data.contains(".com") == false)
					{
						System.out.println("�����ʽ����");
						System.out.println("������ѧ���������䣺");
						data = scanner.next();
						if(data.contains("@") == true && data.contains(".com") == true)
						{
							break;
						}
					}
					StudentManager.stus[i].setStuEmail(data);
				}
				if(type.equals("��ַ")) {
					System.out.println("�������޸ĺ������");
					String data = scanner.next();
					StudentManager.stus[i].setStuAddress(data);
				}
			}
		}
		System.out.println("�޸ĳɹ�"+"\n"+"ϵͳ�Զ������ϲ�Ŀ¼......");
	}
}
