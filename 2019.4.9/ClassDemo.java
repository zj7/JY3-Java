package java0408;

public class ClassDemo {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.name = "����������";
		b1.page = 188;
		b1.author = "���˼ ����˹";
		b1.price = 21.8;
		b1.ISBN = "9787010131566";
		System.out.println("��������ǣ�"+b1.name);
		System.out.println("���ҳ����"+b1.page);
		System.out.println("��������ǣ�"+b1.author);
		System.out.println("��ļ۸�"+b1.price);
		System.out.print("���ISBN�ǣ�"+b1.ISBN);
	}
}
class Book
	{
		String name;
		int page;
		String author;
		String ISBN;
		double price;
		public void read()
		{
			System.out.print("���ڿ��顣����");
		}
	}