package java0410;

public class Question {

	public Question()
	{
		
	}
	
	public Question(int id,String text,String[] ops)
	{
		this.id = id;
		this.text = text;
		this.options = ops;
	}
	//题号
	int id;
	//题干
	String text;
	//选项
	String[] options;
	//检查答案
	public boolean checkAnswer(String[] answers)
	{
		return false;
	}
	
	//打印题目
	public void printQuestion()
	{
		System.out.println(id + "." + text);
		for(int i=0;i<options.length;i++)
		{
			System.out.println("\t" + options[i]);
		}
		System.out.println();
	}
	
}
