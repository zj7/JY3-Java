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
	//���
	int id;
	//���
	String text;
	//ѡ��
	String[] options;
	//����
	public boolean checkAnswer(String[] answers)
	{
		return false;
	}
	
	//��ӡ��Ŀ
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
