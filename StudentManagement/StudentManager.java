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
	
	//����һ��ѧ������
	static Student[] stus = new Student[0];
	//����һ��ɾ�����ѧ������
	static Student[] newStus;
	
	StudentClient sc;
	
	//���ѧ��
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length-1] = student;
	}
	
	//���ѧ����Ϣ����
	public void addStuPage(Scanner scanner)
	{
		System.out.println("******************************���ѧ����Ϣ******************************");
		//����id
		System.out.println("������ѧ��id��");
		int id = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			while(id == stus[i].getId())
			{
				System.out.println("��id"+id+"���ڣ����������룺");
				System.out.println("������ѧ��id��");
				id = scanner.nextInt();
				if(id != stus[i].getId())
				{
					break;
				}
			}
		}
		//��������
		System.out.println("������ѧ��������");
		String name = scanner.next();
		//�����Ա�
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		while(sex != '��' && sex != 'Ů')
		{
			System.out.println("�������");
			System.out.println("������ѧ���Ա�");
			sex = scanner.next().charAt(0);
			if(sex == '��' || sex == 'Ů')
			{
				break;
			}
		}
		//��������
		System.out.println("������ѧ�����䣨ֻ��1-120֮�ڵ����֣���");
		Short age = scanner.nextShort();
		while(age<1 || age>120)
		{
			System.out.println("��������˵�����");
			System.out.println("������ѧ�����䣺");
			age = scanner.nextShort();
			if(age >=1 && age <=120)
			{
				break;
			}
		}
		//�����꼶
		System.out.println("������ѧ�������꼶��ֻ�ܳ������м����߼�����");
		String grade = scanner.next();
		while(!grade.equals("����") && !grade.equals("�м�") && !grade.equals("�߼�"))
		{
			System.out.println("�������");
			System.out.println("������ѧ�������꼶��");
			grade = scanner.next();
			if(grade.equals("����") || grade.equals("�м�") || grade.equals("�߼�"))
			{
				break;
			}
		}
		//�����ַ
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		//������ϵ��ʽ
		System.out.println("������ѧ����ϵ��ʽ��11λ�ֻ����룩��");
		String tel = scanner.next();
		while(tel.length()!=11)
		{
			System.out.println("��������");
			System.out.println("������ѧ����ϵ��ʽ��");
			tel = scanner.next();
			if(tel.length()==11)
			{
				break;
			}
		}
		//��������
		System.out.println("������ѧ���������䣨����@��.com����");
		String email = scanner.next();
		while (email.contains("@") == false || email.contains(".com") == false)
		{
			System.out.println("�����ʽ����");
			System.out.println("������ѧ���������䣺");
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
		//�����ϲ�Ŀ¼
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		sc.studentManagerIndex();
	}
	
	//����IDɾ��ѧ����Ϣ
	public Student[] deleteStudent(int stuId)
	{
		//��������
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
	
	//����ID�޸�ѧ��ȫ����Ϣ
	
	
	
	//����ID�޸�ѧ��������Ϣ
	
	//����ID�鿴ѧ����Ϣ
	public void seeStuMsgById()
	{
		System.out.println("������Ҫ��ѯ��id");
		int id = sc.scanner.nextInt();
		//�ж�ID��ȷ��
		for (int i = 0; i < StudentManager.stus.length; i++) {
			if(id == StudentManager.stus[i].getId())
			{
				break;
			}
			System.out.println("û�д�Id���Զ�������һ��......");
			seeStuMsgById();
		}
		for (int i = 0; i < stus.length; i++) {
			if(id == StudentManager.stus[i].getId())
			{
				System.out.println("------------------------------����ѧ����Ϣ----------------------------------------");
				System.out.println("|ѧ��"+"\t"+"|����"+"\t"+"|����"+"\t"+"|�Ա�"+"\t"+"|�꼶"+"\t"+"|�绰"+"\t\t"+"|EMAIL"+"\t\t"+"|��ַ");
				System.out.println("|"+StudentManager.stus[i].getId()+"\t"+"|"+StudentManager.stus[i].getStuName()+"\t"+"|"+StudentManager.stus[i].getStuAge()
						+"\t"+"|"+StudentManager.stus[i].getStuSex()+"\t"+"|"+StudentManager.stus[i].getStuGrade()+"\t"+"|"+StudentManager.stus[i].getStuTel()
						+"\t"+"|"+StudentManager.stus[i].getStuEmail()+"\t"+"|"+StudentManager.stus[i].getStuAddress());
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");
	}
}
