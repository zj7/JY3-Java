package java0408;

public class ClassDemo {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.name = "共产党宣言";
		b1.page = 188;
		b1.author = "马克思 恩格斯";
		b1.price = 21.8;
		b1.ISBN = "9787010131566";
		System.out.println("书的名字是："+b1.name);
		System.out.println("书的页数："+b1.page);
		System.out.println("书的作者是："+b1.author);
		System.out.println("书的价格："+b1.price);
		System.out.print("书的ISBN是："+b1.ISBN);
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
			System.out.print("正在看书。。。");
		}
	}